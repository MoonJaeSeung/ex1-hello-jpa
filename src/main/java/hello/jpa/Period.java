package hello.jpa;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable // 값 타입을 정의하는 곳에 표시
public class Period {

    private LocalDateTime startDate;
    private LocalDateTime endtDate;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndtDate() {
        return endtDate;
    }

    public void setEndtDate(LocalDateTime endtDate) {
        this.endtDate = endtDate;
    }
}
