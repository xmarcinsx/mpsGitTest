package pl.mps;

public class EmailService {
    private final UsersRepository usersRepository;

    public EmailService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public String getEmailByName(String name) {
        return usersRepository.findAllUsers()
                .stream()
                .filter(user -> user.getName().equals(name))
                .map(user -> user.getEmail())
                .findFirst().orElse(null);
    }
}
