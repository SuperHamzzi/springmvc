package hello.servlet.web.frontcontroller.v3;

import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String,String> paraMap);
}
