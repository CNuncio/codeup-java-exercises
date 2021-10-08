 class EmployeeQuiz extends PersonQuiz{
        private String department;

        public EmployeeQuiz(String name, String department) {
            super(name);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }
    }
}
