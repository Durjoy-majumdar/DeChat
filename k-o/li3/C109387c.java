package li3;

import com.google.protobuf.C23845j1;
import com.google.protobuf.C23845j1.C23846a;
import gy3.C87412m;

/* renamed from: li3.c */
public abstract class C109387c<Message extends C23845j1, Builder extends C23845j1.C23846a> {

    /* renamed from: a */
    public Builder f327462a;

    /* renamed from: a */
    public final Builder mo160583a() {
        Builder builder = this.f327462a;
        if (builder != null) {
            return builder;
        }
        C87412m.m108603p("innerBuilder");
        throw null;
    }

    /* renamed from: b */
    public byte[] mo160584b() {
        Builder builder = this.f327462a;
        if (builder != null) {
            byte[] byteArray = builder.build().toByteArray();
            C87412m.m108590c(byteArray, "innerBuilder.build().toByteArray()");
            return byteArray;
        }
        C87412m.m108603p("innerBuilder");
        throw null;
    }
}
