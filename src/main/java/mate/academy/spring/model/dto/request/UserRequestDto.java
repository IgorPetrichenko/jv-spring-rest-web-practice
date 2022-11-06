package mate.academy.spring.model.dto.request;

import jakarta.validation.constraints.NotNull;
import mate.academy.spring.validation.Email;

public class UserRequestDto {
    @Email
    @NotNull
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
