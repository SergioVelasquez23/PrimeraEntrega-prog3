import BaseSchema from '@ioc:Adonis/Lucid/Schema'

export default class extends BaseSchema {
  protected tableName = 'novedades'

  public async up () {
    this.schema.createTable(this.tableName, (table) => {
      table.increments('id')
      table.string('tipo').notNullable()
      table.string('descripcion').notNullable()
      table.date('evidencia').notNullable()
      table.string('gravedad').notNullable()
      table.integer('turno_id').unsigned().references('id').inTable('turnos').onDelete('CASCADE').notNullable()
      table.timestamp('created_at', { useTz: true }).defaultTo(this.now());
      table.timestamp('updated_at', { useTz: true }).defaultTo(this.now());
    })
  }

  public async down () {
    this.schema.dropTable(this.tableName)
  }
}
