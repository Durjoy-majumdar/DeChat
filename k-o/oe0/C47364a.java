package oe0;

import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.roomsdk.model.factory.C72941b;
import com.tencent.p014mm.roomsdk.model.factory.C72946e;
import com.tencent.p014mm.roomsdk.model.factory.RoomOpLogCallbackFactory;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C45759r0;
import f62.C75700k0;
import java.util.List;
import java.util.Set;
import je0.C46471d;
import je0.C46474g;
import je0.C46475h;
import je0.C46482k;
import je0.C46484l;
import je0.C46495r;
import je0.C46497t;
import me0.C47005e;
import me0.C47006f;
import me0.C47007g;
import me0.C47009i;
import me0.C47012l;
import mg3.C47024a;
import og3.C77007c;
import qe0.C47803d;
import sf0.C77691f;

/* renamed from: oe0.a */
public class C47364a implements C77007c {
    /* renamed from: a */
    public C72940a mo71490a(String str, List<String> list, int i) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46475h(str, C47803d.m53113a(list));
        return bVar;
    }

    /* renamed from: b */
    public C72940a mo71491b(String str, boolean z) {
        RoomOpLogCallbackFactory roomOpLogCallbackFactory = new RoomOpLogCallbackFactory(false);
        roomOpLogCallbackFactory.f212606f = new C47012l(str);
        return roomOpLogCallbackFactory;
    }

    /* renamed from: c */
    public C72940a mo71492c(String str, int i) {
        RoomOpLogCallbackFactory roomOpLogCallbackFactory = new RoomOpLogCallbackFactory(false);
        roomOpLogCallbackFactory.f212606f = new C47005e(str, i == 0 ? 1 : 2);
        return roomOpLogCallbackFactory;
    }

    /* renamed from: d */
    public void mo71493d(C72996z1 z1Var, boolean z) {
        Class cls = C45759r0.class;
        if (z) {
            z1Var.mo62868O3();
            Set<String> set = C45628s0.f123410p;
            boolean z2 = false;
            if (C72996z1.m85820U5(z1Var.getUsername()) && z1Var.mo62927s3()) {
                z2 = true;
            }
            if (z2) {
                z1Var.mo62886Y2(43);
                z1Var.mo62882W2(C77691f.m93687b(z1Var.mo62909j3()));
                z1Var.mo62884X2(C77691f.m93686a(z1Var.mo62909j3()));
                z1Var.mo62862L2(C77691f.m93686a(z1Var.mo62898f()));
                z1Var.mo62864M2(z1Var.mo62898f());
            }
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
            ((C45759r0) C86312j.m106911c(cls)).mo71240Hi(z1Var.getUsername());
            return;
        }
        ((C45759r0) C86312j.m106911c(cls)).Er0(z1Var.getUsername());
    }

    /* renamed from: e */
    public C72940a mo71494e(String str, List<String> list) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46474g(C47803d.m53113a(list));
        return bVar;
    }

    /* renamed from: f */
    public C72940a mo71495f(String str, String str2, String str3) {
        RoomOpLogCallbackFactory roomOpLogCallbackFactory = new RoomOpLogCallbackFactory(false);
        roomOpLogCallbackFactory.f212606f = new C47006f(str, str3);
        return roomOpLogCallbackFactory;
    }

    /* renamed from: g */
    public C72940a mo71496g(String str, List<String> list, String str2, String str3) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46474g(C47803d.m53113a(list));
        return bVar;
    }

    /* renamed from: h */
    public C72940a mo71497h(String str, List<String> list, int i, Object obj) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46495r(str, C47803d.m53113a(list));
        return bVar;
    }

    /* renamed from: i */
    public C72940a mo71498i(String str, String str2) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46497t(str2, str);
        return bVar;
    }

    /* renamed from: j */
    public C72940a mo71499j(String str, String str2, boolean z) {
        RoomOpLogCallbackFactory roomOpLogCallbackFactory = new RoomOpLogCallbackFactory(false);
        roomOpLogCallbackFactory.f212606f = new C47007g(str, z ? 1 : 2);
        return roomOpLogCallbackFactory;
    }

    /* renamed from: k */
    public C47024a mo71500k(int i) {
        return new C72946e(i);
    }

    /* renamed from: l */
    public C72940a mo71501l(String str, int i) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46484l(str, i);
        return bVar;
    }

    /* renamed from: m */
    public C72940a mo71502m(String str, String str2) {
        RoomOpLogCallbackFactory roomOpLogCallbackFactory = new RoomOpLogCallbackFactory(false);
        roomOpLogCallbackFactory.f212606f = new C47009i(str, str2);
        return roomOpLogCallbackFactory;
    }

    /* renamed from: n */
    public C72940a mo71503n(String str, List<String> list, String str2, Object obj) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46471d(str, C47803d.m53113a(list), str2);
        return bVar;
    }

    /* renamed from: o */
    public C72940a mo71504o(String str) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46482k(str);
        return bVar;
    }

    /* renamed from: p */
    public C72940a mo71505p(String str, List<String> list, int i, String str2, C72963f4 f4Var) {
        C72941b bVar = new C72941b(false);
        bVar.f212617f = new C46495r(str, C47803d.m53113a(list));
        return bVar;
    }

    /* renamed from: q */
    public C72940a mo71506q(String str, String str2) {
        return null;
    }
}
