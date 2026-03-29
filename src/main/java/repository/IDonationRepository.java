package repository;

import domain.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDonationRepository extends JpaRepository<Donation, Integer> {
    // Spring Data JPA will auto-generate CRUD methods
}