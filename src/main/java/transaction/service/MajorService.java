package transaction.service;


import transaction.message.Message;

import java.util.List;

public interface MajorService {
    List fetchAdmins();
    Message insertAdmin() throws Exception;
}
