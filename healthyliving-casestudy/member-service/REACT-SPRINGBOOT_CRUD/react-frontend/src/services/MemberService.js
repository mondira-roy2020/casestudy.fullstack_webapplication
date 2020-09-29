import axios from 'axios';

const MEMBER_API_BASE_URL = "http://localhost:8080/api/members";

class MemberService {

  getMembers(){
    return axios.get(MEMBER_API_BASE_URL);
}
  createMember(member){
    return axios.post(MEMBER_API_BASE_URL,member);
  }
}

export default new MemberService()