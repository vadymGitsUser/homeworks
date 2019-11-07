public enum DaysOfWeek {
    MONDAY{
        public int getNextDay() {
            return ordinal()+1;
        }
    },
    TUESDAY{
        public int getNextDay() {
            return ordinal()+1;
        }
    },WEDNESDAY{
        public int getNextDay() {
            return ordinal()+1;
        }
    },
    THURSDAY{
        public int getNextDay() {
            return ordinal()+1;
        }
    },
    FRIDAY{
        public int getNextDay() {
            return ordinal()+1;
        }
    },
    SATURDAY{
        public int getNextDay() {
            return ordinal()+1;
        }
    },
    SUNDAY{
        public int getNextDay() {
            return ordinal()-6;
        }
    };
    public abstract int getNextDay();
}
