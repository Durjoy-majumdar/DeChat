package nn2;

import android.os.Message;
import com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.List;
import jn2.C21269b;

/* renamed from: nn2.l */
public class C21685l {

    /* renamed from: a */
    public int f61388a;

    /* renamed from: b */
    public C21687b f61389b;

    /* renamed from: c */
    public long f61390c;

    /* renamed from: nn2.l$a */
    public interface C21686a {
    }

    /* renamed from: nn2.l$b */
    public static abstract class C21687b {

        /* renamed from: d */
        public C21686a f61391d;

        /* renamed from: nn2.l$b$a */
        public class C21688a implements MMHandler.Callback {
            public C21688a() {
            }

            public boolean handleMessage(Message message) {
                if (message.what != 54158) {
                    return false;
                }
                C21687b.this.getClass();
                C21686a aVar = C21687b.this.f61391d;
                if (aVar == null) {
                    return false;
                }
                ((ShakeReportUI) aVar).mo24635O7((List<C47288f>) null, 5);
                return false;
            }
        }

        public C21687b(C21686a aVar) {
            new MMHandler((MMHandler.Callback) new C21688a());
            this.f61391d = aVar;
        }

        /* renamed from: a */
        public abstract void mo33950a();

        /* renamed from: b */
        public abstract void mo33951b();

        /* renamed from: c */
        public abstract void mo33952c();

        /* renamed from: d */
        public abstract void mo33953d();

        /* renamed from: e */
        public abstract void mo33954e();
    }

    public C21685l() {
        C21269b.f60082a = "" + System.currentTimeMillis();
    }

    /* renamed from: a */
    public long mo33949a() {
        return System.currentTimeMillis() - this.f61390c;
    }
}
