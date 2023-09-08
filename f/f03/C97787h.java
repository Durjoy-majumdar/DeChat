package f03;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import wx3.C15601d;

/* renamed from: f03.h */
public interface C97787h {

    /* renamed from: f03.h$a */
    public static class C97788a extends IllegalStateException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97788a(int i, String str) {
            super(str);
            C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        }
    }

    /* renamed from: f03.h$b */
    public static final class C97789b extends C97788a {
        public C97789b(int i) {
            super(i, "File is expired: code=" + i);
        }
    }

    /* renamed from: f03.h$c */
    public static final class C97790c extends C97788a {
        public C97790c(int i) {
            super(i, "Timeout to transfer: code=" + i);
        }
    }

    /* renamed from: f03.h$d */
    public interface C97791d {
        /* renamed from: a */
        void mo135904a(Long l, long j, long j2);

        /* renamed from: b */
        void mo135905b(Long l, long j, long j2);

        /* renamed from: c */
        void mo135906c(Long l);

        /* renamed from: d */
        void mo135907d(Long l, long j, long j2);

        /* renamed from: e */
        void mo135908e(Long l, int i);

        /* renamed from: f */
        void mo135909f(Long l);
    }

    /* renamed from: a */
    long mo134528a();

    /* renamed from: b */
    boolean mo134529b();

    /* renamed from: c */
    Object mo134530c(C15601d<? super Boolean> dVar);

    /* renamed from: d */
    float mo134531d();

    /* renamed from: e */
    void mo134532e();

    /* renamed from: f */
    long mo134533f();

    /* renamed from: g */
    boolean mo134534g();

    String getMediaId();

    /* renamed from: h */
    boolean mo134536h(long j, long j2);

    /* renamed from: i */
    long mo134537i(long j, long j2);

    /* renamed from: j */
    String mo134538j();

    /* renamed from: k */
    Object mo134539k(C15601d<? super CdnLogic.VideoInfo> dVar);

    boolean start();

    void stop();
}
