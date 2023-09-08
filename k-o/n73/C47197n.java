package n73;

import android.os.Looper;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.autogen.events.WearActionEvent;
import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C1500a;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.plugin.wear.model.C43462g;
import com.tencent.p014mm.plugin.wear.model.C43464h;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.tav.coremedia.TimeUtil;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import i61.C98602h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kd0.C76546u;
import kd0.C76552z;
import l73.C46836a;
import lc3.C10485b;
import o73.C47336d;
import p375qh.C101193k;
import p827uh.C102034c;
import te3.e45;
import te3.jb4;
import te3.n15;
import te3.o15;
import te3.p15;
import te3.q15;
import te3.t05;
import te3.u15;
import tw0.C90583b;
import tw0.C90584e;
import z51.C39315g;

/* renamed from: n73.n */
public class C47197n extends C47188b {

    /* renamed from: n73.n$a */
    public static class C47198a extends C47336d {

        /* renamed from: d */
        public q15 f126744d;

        public C47198a(q15 q15) {
            this.f126744d = q15;
        }

        /* renamed from: a */
        public void mo67620a() {
            String i = C76552z.m92071i(this.f126744d.f140091d, "amr_");
            Log.m105925i("MicroMsg.Wear.HttpReplyServer", "get fileName=%s", i);
            String j = C76552z.m92072j(i, false);
            Log.m105925i("MicroMsg.Wear.HttpReplyServer", "get fullPath=%s", j);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f126744d.f140093f.mo123703f());
            C102034c cVar = new C102034c(8000, 16000);
            cVar.mo73537a(j);
            byte[] bArr = new byte[C0947jz.f2205e];
            int i2 = 0;
            while (true) {
                try {
                    i2 = byteArrayInputStream.read(bArr, 0, C0947jz.f2205e);
                } catch (IOException unused) {
                }
                if (i2 <= 0) {
                    cVar.mo73541e();
                    Log.m105924i("MicroMsg.Wear.HttpReplyServer", "amr compress finish");
                    C76552z.m92085w(i, (int) this.f126744d.f140092e, 0);
                    C76546u.xx0().mo107480e();
                    Log.m105924i("MicroMsg.Wear.HttpReplyServer", "run service to send the voice");
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(this.f126744d.f140091d);
                    return;
                }
                cVar.mo73538b(new C101193k.C101194a(bArr, i2), 0);
            }
        }

        /* renamed from: b */
        public String mo67621b() {
            return "SendVioceMsgTask";
        }
    }

    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11022);
        arrayList.add(11023);
        arrayList.add(11025);
        arrayList.add(11024);
        arrayList.add(11026);
        arrayList.add(11029);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        int i2 = i;
        byte[] bArr2 = bArr;
        Class cls = C39315g.class;
        ((C90584e) C86312j.m106911c(C90584e.class)).bs0(C90583b.f260267k, C1500a.CTRL_INDEX);
        int i3 = 0;
        if (i2 != 11029) {
            switch (i2) {
                case 11022:
                    q15 q15 = new q15();
                    try {
                        q15.parseFrom(bArr2);
                    } catch (IOException unused) {
                    }
                    C43457b.Ax0().mo67630a(new C47198a(q15));
                    C43464h yx02 = C43457b.yx0();
                    String str = q15.f140091d;
                    synchronized (yx02) {
                        if (yx02.f117487a.containsKey(str)) {
                            C43462g gVar = yx02.f117487a.get(str);
                            gVar.f117480e = C43462g.C43463a.REPLY;
                            gVar.f117479d = 0;
                            Log.m105925i("MicroMsg.Wear.WearNotificationMap", "Update reply success, notification=%s", gVar);
                        }
                    }
                    C46836a.m52129b(2, q15.f140094g);
                    C46836a.m52128a(2);
                    break;
                case 11023:
                    p15 p15 = new p15();
                    try {
                        p15.parseFrom(bArr2);
                    } catch (IOException unused2) {
                    }
                    C97425j a = C7250m.m7431a();
                    String str2 = p15.f139531d;
                    a.mo136257Tm(str2, p15.f139532e, C45628s0.m50810y(str2), 0);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(p15.f139531d);
                    C46836a.m52129b(3, p15.f139533f);
                    C46836a.m52128a(5);
                    break;
                case 11024:
                    n15 n15 = new n15();
                    try {
                        n15.parseFrom(bArr2);
                    } catch (IOException unused3) {
                    }
                    ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138010Q(MMApplicationContext.getContext(), n15.f138331d, n15.f138332e);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(n15.f138331d);
                    C46836a.m52129b(7, n15.f138334g);
                    C46836a.m52128a(3);
                    break;
                case 11025:
                    o15 o15 = new o15();
                    try {
                        o15.parseFrom(bArr2);
                    } catch (IOException unused4) {
                    }
                    C97425j a2 = C7250m.m7431a();
                    String str3 = o15.f138905d;
                    a2.mo136257Tm(str3, o15.f138906e, C45628s0.m50810y(str3), 0);
                    ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138010Q(MMApplicationContext.getContext(), o15.f138905d, o15.f138907f);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(o15.f138905d);
                    C46836a.m52129b(8, o15.f138909h);
                    C46836a.m52128a(4);
                    break;
                case 11026:
                    u15 u15 = new u15();
                    try {
                        u15.parseFrom(bArr2);
                    } catch (IOException unused5) {
                    }
                    C43457b.wx0().getClass();
                    t05 t05 = C43457b.xx0().f347577c.f126742a;
                    if (t05 != null) {
                        Log.m105925i("MicroMsg.Wear.WearBizLogic", "receive step count %d | time %s", Integer.valueOf(u15.f142554d), C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, u15.f142555e / 1000));
                        e45 e45 = new e45();
                        jb4 jb4 = new jb4();
                        int i4 = u15.f142554d;
                        if (i4 > 0) {
                            i3 = i4;
                        }
                        jb4.f135996d = i3;
                        jb4.f135997e = (int) (u15.f142555e / 1000);
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(u15.f142555e);
                        jb4.f135998f = instance.get(1);
                        jb4.f135999g = instance.get(2) + 1;
                        jb4.f136000h = instance.get(5);
                        jb4.f136001i = instance.get(11);
                        jb4.f136002j = instance.get(12);
                        jb4.f136003n = instance.get(13);
                        jb4.f136004o = t05.f141887e;
                        e45.f132692d.add(jb4);
                        WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
                        try {
                            wearHardDeviceEvent.f107826d.f107831e = e45.toByteArray();
                        } catch (IOException unused6) {
                        }
                        WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
                        aVar.f107827a = 4;
                        aVar.f107829c = t05.f141886d;
                        aVar.f107830d = "gh_43f2581f6fd6";
                        wearHardDeviceEvent.publish();
                        break;
                    } else {
                        Log.m105920e("MicroMsg.Wear.WearBizLogic", "logicRequest is null");
                        break;
                    }
            }
        } else if (C43457b.xx0().mo176383d() && ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WearLuckyBlock", 0) == 0) {
            long j = 0;
            try {
                j = Long.valueOf(new String(bArr2)).longValue();
            } catch (Exception unused7) {
            }
            WearActionEvent wearActionEvent = new WearActionEvent();
            WearActionEvent.C40182a aVar2 = wearActionEvent.f107808d;
            aVar2.f107810a = 1;
            aVar2.f107811b = j;
            wearActionEvent.asyncPublish(Looper.getMainLooper());
            C46836a.m52129b(11, 0);
            C46836a.m52128a(11);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo72262c(int i) {
        return i == 11023 || i == 11025;
    }
}
