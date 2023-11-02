package com.oshri.finalproject.Types;

public enum Types implements  IType {
    Basic{
        @Override
        public float getMultiplierDefense(Types t) {
            switch(t){
                case Arcane:
                    return 2;
                default:
                    return 1;
            }
            // The types that are effective on (Basic)
        }
        @Override
        public float getMultiplierAttack(Types t) {
            switch (t){
                case Mineral:
                    return 0.5f;
                case Arcane:
                    return 0;
                default:
                    return 1;
            }
        // The types (Basic) moves are effective on
        }
    },
    Pyro{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Pyro) moves are effective on
            switch (t){
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 2;
                case Aqua:
                    return 0.5f;
                case Insect:
                    return 2;
                case Terra:
                    return 0.5f;
                case Mineral:
                    return 0.5f;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Pyro)
            switch (t){
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 0.5f;
                case Aqua:
                    return 2;
                case Insect:
                    return 0.5f;
                case Terra:
                    return 2;
                case Mineral:
                    return 2;
                default:
                    return 1;
            }
        }
    },
    Flora{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Flora) moves are effective on
            switch (t){
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 0.5f;
                case Aqua:
                    return 2;
                case Insect:
                    return 0.5f;
                case Aero:
                    return 0.5f;
                case Terra:
                    return 2;
                case Mineral:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Flora)
            switch (t){
                case Pyro:
                    return 2;
                case Flora:
                    return 0.5f;
                case Aqua:
                    return 0.5f;
                case Electric:
                    return 0.5f;
                case Insect:
                    return 2;
                case Poison:
                    return 2;
                case Terra:
                    return 0.5f;
                default:
                    return 1;
            }
        }
    },
    Aqua{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Aqua) moves are effective on
            switch (t){
                case Pyro:
                    return 2;
                case Flora:
                    return 0.5f;
                case Aqua:
                    return 0.5f;
                case Poison:
                    return 2;
                case Terra:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Aqua)
            switch (t){
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 2;
                case Aqua:
                    return 0.5f;
                case Electric:
                    return 2;
                default:
                    return 1;
            }
        }
    },
    Electric{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Electric) moves are effective on
            switch (t){
                case Flora:
                    return 0.5f;
                case Aqua:
                    return 2;
                case Electric:
                    return 0.5f;
                case Aero:
                    return 2;
                case Terra:
                    return 0;
                case Mineral:
                    return 0.5f;
                case Arcane:
                    return 0.5f;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Electric)
            switch (t){
                case Electric:
                    return 0.5f;
                case Aero:
                    return 0.5f;
                case Terra:
                    return 2;
                case Arcane:
                    return 2;
                default:
                    return 1;
            }
        }
    },
    Insect{
        @Override
        public float getMultiplierAttack(Types t) { // The types (insect) moves are effective on
            switch (t){
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 2;
                case Poison:
                    return 0.5f;
                case Aero:
                    return 0.5f;
                case Mineral:
                    return 0.5f;
                case Arcane:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (insect)
            switch (t){
                case Pyro:
                    return 2;
                case Flora:
                    return 0.5f;
                case Poison:
                    return 2;
                case Aero:
                    return 2;
                case Terra:
                    return 0.5f;
                case Mineral:
                    return 2;
                case Arcane:
                    return 0.5f;
                default:
                    return 1;
            }
        }
    },
    Poison{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Poison) moves are effective on
            switch (t){
                case Flora:
                    return 2;
                case Insect:
                    return 2;
                case Poison:
                    return 0.5f;
                case Terra:
                    return 0.5f;
                case Arcane:
                    return 0.5f;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Poison)
            switch (t){
                case Aqua:
                    return 2;
                case Insect:
                    return 0.5f;
                case Poison:
                    return 0.5f;
                case Terra:
                    return 2;
                default:
                    return 1;
            }
        }
    },
    Aero{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Aero) moves are effective on
            switch (t){
                /*case Flora:
                    return 2;*/
                case Electric:
                    return 0.5f;
                case Insect:
                    return 2;
                case Mineral:
                    return 0.5f;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Aero)
            switch (t){
                case Flora:
                    return 0.5f;
                case Electric:
                    return 2;
                case Insect:
                    return 0.5f;
                case Terra:
                    return 0;
                case Mineral:
                    return 2;
                default:
                    return 1;
            }
        }
    },
    Terra{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Terra) moves are effective on
            switch (t){
                case Pyro:
                    return 2;
                case Flora:
                    return 0.5f;
                case Electric:
                    return 2;
                case Insect:
                    return 0.5f;
                case Poison:
                    return 2;
                case Aero:
                    return 0;
                case Mineral:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Terra)
            switch (t){
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 2;
                case Aqua:
                    return 2;
                case Electric:
                    return 0;
                case Poison:
                    return 0.5f;
                case Mineral:
                    return 0.5f;
                default:
                    return 1;
            }
        }
    },
    Mineral{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Mineral) moves are effective on
            switch (t){
                case Pyro:
                    return 2;
                case Insect:
                    return 2;
                case Aero:
                    return 2;
                case Terra:
                    return 0.5f;
                case Mineral:
                    return 0.5f;
                case Arcane:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Mineral)
            switch (t){
                case Basic:
                    return 0.5f;
                case Pyro:
                    return 0.5f;
                case Flora:
                    return 2;
                case Aqua:
                    return 2;
                case Electric:
                    return 0.5f;
                case Insect:
                    return 0.5f;
                case Terra:
                    return 2;
                case Mineral:
                    return 0.5f;
                default:
                    return 1;
            }
        }
    },
    Arcane{
        @Override
        public float getMultiplierAttack(Types t) { // The types (Arcane) moves are effective on
            switch (t){
                case Basic:
                    return 2;
                case Electric:
                    return 2;
                case Insect:
                    return 0.5f;
                case Arcane:
                    return 2;
                default:
                    return 1;
            }
        }

        @Override
        public float getMultiplierDefense(Types t) { // The types that are effective on (Arcane)
            switch (t){
                case Basic:
                    return 0;
                case Electric:
                    return 0.5f;
                case Insect:
                    return 2;
                case Poison:
                    return 0.5f;
                case Mineral:
                    return 2;
                case Arcane:
                    return 2;
                default:
                    return 1;
            }
        }
    },
    Null{ //represents the absence of a type
        @Override
        public float getMultiplierDefense(Types t) {
            return 1;
        }

        @Override
        public float getMultiplierAttack(Types t) {
            return 1;
        }
    }

}
