package es.masanz.ut7.pokemonfx.model.base;

import es.masanz.ut7.pokemonfx.model.enums.TipoItem;

public abstract class Item {
        protected TipoItem tipo;

        public Item(TipoItem tipo) {
            this.tipo = tipo;
        }

        public TipoItem getTipo() {
            return tipo;
        }

        public abstract void usar();

}
