package com.parcialT2.parcialT2.repository;
import com.parcialT2.parcialT2.models.PaymentDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository
 * used to indicate that a class provides the mechanism for storage, retrieval, update, delete,
 * and search operations on objects
 */
@Repository
public interface paymentDetailsRepository extends MongoRepository <PaymentDetails ,Integer > {

}
