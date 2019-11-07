package com.corevalue.homework;

public enum WeekDays {
    MONDAY {
        @Override
        public String getNextDay() {
            return TUESDAY.toString();
        }
    },
    TUESDAY {
        @Override
        public String getNextDay() {
            return WEDNESDAY.toString();
        }
    },
    WEDNESDAY {
        @Override
        public String getNextDay() {
            return THURSDAY.toString();
        }
    },
    THURSDAY {
        @Override
        public String getNextDay() {
            return FRIDAY.toString();
        }
    },
    FRIDAY {
        @Override
        public String getNextDay() {
            return SATURDAY.toString();
        }
    },
    SATURDAY {
        @Override
        public String getNextDay() {
            return SUNDAY.toString();
        }
    },
    SUNDAY {
        @Override
        public String getNextDay() {
            return MONDAY.toString();
        }
    };

    public abstract String getNextDay();
}
