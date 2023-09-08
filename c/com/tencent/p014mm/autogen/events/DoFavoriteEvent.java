package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C101801kd0;
import te3.C64878zd0;

/* renamed from: com.tencent.mm.autogen.events.DoFavoriteEvent */
public final class DoFavoriteEvent extends IEvent {

    /* renamed from: d */
    public C92474a f264674d = new C92474a();

    /* renamed from: e */
    public C1001b f264675e = new C1001b();

    /* renamed from: com.tencent.mm.autogen.events.DoFavoriteEvent$b */
    public static final class C1001b {

        /* renamed from: a */
        public int f9046a = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.DoFavoriteEvent$a */
    public static final class C92474a {

        /* renamed from: a */
        public C101801kd0 f264676a;

        /* renamed from: b */
        public C64878zd0 f264677b;

        /* renamed from: c */
        public int f264678c = 0;

        /* renamed from: d */
        public String f264679d;

        /* renamed from: e */
        public String f264680e;

        /* renamed from: f */
        public String f264681f;

        /* renamed from: g */
        public int f264682g = 0;

        /* renamed from: h */
        public String f264683h;

        /* renamed from: i */
        public Activity f264684i;

        /* renamed from: j */
        public Fragment f264685j;

        /* renamed from: k */
        public View f264686k;

        /* renamed from: l */
        public int f264687l = 0;

        /* renamed from: m */
        public int f264688m = 0;

        /* renamed from: n */
        public int f264689n = 0;

        /* renamed from: o */
        public boolean f264690o = false;

        /* renamed from: p */
        public DialogInterface.OnClickListener f264691p;

        /* renamed from: q */
        public C75018a.C75025e f264692q;

        /* renamed from: r */
        public boolean f264693r = true;
    }

    public DoFavoriteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DoFavoriteEvent)) {
            return false;
        }
        DoFavoriteEvent doFavoriteEvent = (DoFavoriteEvent) iEvent;
        C92474a aVar = doFavoriteEvent.f264674d;
        if (!C46238a.m51546a(this.f264674d.f264676a, aVar.f264676a) || !C46238a.m51546a(this.f264674d.f264677b, aVar.f264677b) || !C46238a.m51546a(Integer.valueOf(this.f264674d.f264678c), Integer.valueOf(aVar.f264678c)) || !C46238a.m51546a(this.f264674d.f264679d, aVar.f264679d) || !C46238a.m51546a(this.f264674d.f264680e, aVar.f264680e) || !C46238a.m51546a(this.f264674d.f264681f, aVar.f264681f) || !C46238a.m51546a(Integer.valueOf(this.f264674d.f264682g), Integer.valueOf(aVar.f264682g)) || !C46238a.m51546a(this.f264674d.f264683h, aVar.f264683h) || !C46238a.m51546a(this.f264674d.f264684i, aVar.f264684i) || !C46238a.m51546a(this.f264674d.f264685j, aVar.f264685j) || !C46238a.m51546a(this.f264674d.f264686k, aVar.f264686k) || !C46238a.m51546a(Integer.valueOf(this.f264674d.f264687l), Integer.valueOf(aVar.f264687l)) || !C46238a.m51546a(Integer.valueOf(this.f264674d.f264688m), Integer.valueOf(aVar.f264688m)) || !C46238a.m51546a(Integer.valueOf(this.f264674d.f264689n), Integer.valueOf(aVar.f264689n)) || !C46238a.m51546a(Boolean.valueOf(this.f264674d.f264690o), Boolean.valueOf(aVar.f264690o))) {
            return false;
        }
        this.f264674d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool) || !C46238a.m51546a(this.f264674d.f264691p, aVar.f264691p) || !C46238a.m51546a(this.f264674d.f264692q, aVar.f264692q) || !C46238a.m51546a(Boolean.valueOf(this.f264674d.f264693r), Boolean.valueOf(aVar.f264693r))) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f264675e.f9046a), Integer.valueOf(doFavoriteEvent.f264675e.f9046a));
    }
}
