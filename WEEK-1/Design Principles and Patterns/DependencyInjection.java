public class DependencyInjection {

    interface CustomerRepository {
        String findCustomerById(int id);
    }

    static class CustomerRepositoryImpl implements CustomerRepository {

        public String findCustomerById(int id) {
            return "Customer ID: " + id + ", Name: Rahul Sharma";
        }
    }

    static class CustomerService {

        private CustomerRepository repository;

        CustomerService(CustomerRepository repository) {
            this.repository = repository;
        }

        public void getCustomer(int id) {
            System.out.println(repository.findCustomerById(id));
        }
    }

    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.getCustomer(101);
    }
}