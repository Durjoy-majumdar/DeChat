package p595ll;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C89349b;
import rx3.C13598b0;

/* renamed from: ll.l */
public final class C99500l {

    /* renamed from: a */
    public final int f291721a;

    /* renamed from: b */
    public final String f291722b;

    /* renamed from: ll.l$a */
    public static final class C88570a extends C87413o implements C32228q<Boolean, List<? extends String>, C89349b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C72994y1.C72995a f255813d;

        /* renamed from: e */
        public final /* synthetic */ C72994y1.C72995a f255814e;

        /* renamed from: f */
        public final /* synthetic */ C99500l f255815f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88570a(C72994y1.C72995a aVar, C72994y1.C72995a aVar2, C99500l lVar) {
            super(3);
            this.f255813d = aVar;
            this.f255814e = aVar2;
            this.f255815f = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            List list = (List) obj2;
            C89349b bVar = (C89349b) obj3;
            C87412m.m108594g(list, "needInfoList");
            if (booleanValue) {
                C86709a0.m107535s().mo121142i().mo119677K(this.f255813d, Long.valueOf(System.currentTimeMillis() + 86400000));
                C86709a0.m107535s().mo121142i().mo119677K(this.f255814e, Boolean.FALSE);
                C115669n.INSTANCE.idkeyStat(164, 0, 1, false);
                new C99495d(list, bVar, new C99499k(this.f255815f, this.f255814e));
            } else {
                C115669n.INSTANCE.idkeyStat(164, 1, 1, false);
                C86709a0.m107535s().mo121142i().mo119677K(this.f255813d, Long.valueOf(System.currentTimeMillis() + 3600000));
                C86709a0.m107535s().mo121142i().mo119677K(this.f255814e, Boolean.TRUE);
            }
            return C13598b0.f38549a;
        }
    }

    public C99500l(int i, String str) {
        this.f291721a = i;
        this.f291722b = str;
    }

    /* renamed from: a */
    public final void mo138911a() {
        C72994y1.C72995a aVar;
        C72994y1.C72995a aVar2;
        int i = this.f291721a;
        if (i == 1) {
            aVar2 = C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            aVar = C72994y1.C72995a.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG;
        } else {
            aVar2 = C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            aVar = C72994y1.C72995a.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG;
        }
        new C99502o(i, this.f291722b, new C88570a(aVar, aVar2, this));
    }
}
