package e62;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateExtDeviceEvent;
import com.tencent.p014mm.modelsimple.C1308r0;
import com.tencent.p014mm.modelsimple.C40356d;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45609f2;
import f40.C86709a0;
import f62.C75700k0;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import ol0.C117815j0;
import p910lj.C76701a;
import te3.C51199s42;
import te3.C51945xa0;
import te3.C64253b63;
import te3.C64720t42;

/* renamed from: e62.c */
public class C75554c extends C117747y implements C1311n {

    /* renamed from: e */
    public static String f221950e = null;

    /* renamed from: f */
    public static String f221951f = null;

    /* renamed from: g */
    public static ArrayList<C75555b> f221952g = null;

    /* renamed from: h */
    public static int f221953h = 0;

    /* renamed from: i */
    public static int f221954i = -1;

    /* renamed from: j */
    public static int f221955j;

    /* renamed from: n */
    public static int f221956n;

    /* renamed from: o */
    public static int f221957o;

    /* renamed from: d */
    public C11385n f221958d;

    /* renamed from: e62.c$a */
    public class C7601a implements C87581a<Object, C89132b.C89134c<C51945xa0>> {

        /* renamed from: a */
        public final /* synthetic */ C1308r0 f25867a;

        /* renamed from: b */
        public final /* synthetic */ C75555b f25868b;

        public C7601a(C1308r0 r0Var, C75555b bVar) {
            this.f25867a = r0Var;
            this.f25868b = bVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.NetSceneGetOnlineInfo", "changeDeviceAutoLogin errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                return null;
            }
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.gcs, 0).show();
            if (this.f25867a == C1308r0.kPushLoginUrlAutoLoginSettingDisabled) {
                this.f25868b.f221961C = true;
            } else {
                this.f25868b.f221961C = false;
            }
            new UpdateExtDeviceEvent().publish();
            return null;
        }
    }

    /* renamed from: e62.c$b */
    public static class C75555b extends C64253b63 {

        /* renamed from: A */
        public boolean f221959A;

        /* renamed from: B */
        public boolean f221960B;

        /* renamed from: C */
        public boolean f221961C;

        /* renamed from: p */
        public String f221962p;

        /* renamed from: q */
        public String f221963q;

        /* renamed from: r */
        public String f221964r;

        /* renamed from: s */
        public String f221965s;

        /* renamed from: t */
        public String f221966t;

        /* renamed from: u */
        public String f221967u;

        /* renamed from: v */
        public String f221968v;

        /* renamed from: w */
        public String f221969w;

        /* renamed from: x */
        public boolean f221970x;

        /* renamed from: y */
        public boolean f221971y;

        /* renamed from: z */
        public boolean f221972z;
    }

    public C75554c(int i) {
        f221953h = i;
    }

    /* renamed from: j1 */
    public static void m90587j1(C75555b bVar, C1308r0 r0Var) {
        if (bVar != null && r0Var != null) {
            Log.m105925i("MicroMsg.NetSceneGetOnlineInfo", "changeDeviceAutoLogin iconType:%s, setting:%s", Integer.valueOf(bVar.f182221n), Integer.valueOf(r0Var.f10433d));
            new C40356d(bVar.f182215e, bVar.f182220j, r0Var).mo9225i().mo123064p(new C7601a(r0Var, bVar));
        }
    }

    /* renamed from: k1 */
    public static C75555b m90588k1() {
        ArrayList<C75555b> arrayList = f221952g;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return f221952g.get(0);
    }

    /* renamed from: l1 */
    public static ArrayList<C75555b> m90589l1() {
        ArrayList<C75555b> arrayList = f221952g;
        return arrayList != null ? arrayList : new ArrayList<>();
    }

    /* renamed from: m1 */
    public static boolean m90590m1() {
        C75555b bVar;
        Iterator<C75555b> it = m90589l1().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (!bVar.f221970x && bVar.f221959A) {
                break;
            }
        }
        return bVar != null;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51199s42 s422 = new C51199s42();
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        s422.f141318d = applicationLanguage;
        Log.m105919d("MicroMsg.NetSceneGetOnlineInfo", "language %s", applicationLanguage);
        bVar.f127066a = s422;
        bVar.f127067b = new C64720t42();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getonlineinfo";
        bVar.f127069d = C117815j0.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f221958d = nVar;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return C117815j0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        Log.m105925i("MicroMsg.NetSceneGetOnlineInfo", "ongynetend %d, %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = (C47350c) uVar;
            C64720t42 t422 = (C64720t42) cVar.f127056b.f127083a;
            int i6 = t422.f185484h;
            f221954i = i6;
            Log.m105919d("MicroMsg.NetSceneGetOnlineInfo", "iconType:%d onlineInfoFlag:%d", Integer.valueOf(i6), Integer.valueOf(t422.f185483g));
            Map<String, String> parseXml = XmlParser.parseXml(t422.f185482f, "summary", (String) null);
            boolean m1 = m90590m1();
            f221952g = null;
            if (parseXml != null) {
                f221950e = parseXml.get(".summary.banner");
                f221951f = Util.nullAsNil(parseXml.get(".summary.device_name"));
                f221955j = t422.f185483g;
                Log.m105919d("MicroMsg.NetSceneGetOnlineInfo", "onlineinfo, count:%d, summary:%s, infoFlag:%s", Integer.valueOf(t422.f185480d), t422.f185482f, Integer.valueOf(f221955j));
                C51199s42 s422 = (C51199s42) cVar.f127055a.f127080a;
                f221952g = new ArrayList<>();
                Iterator<C64253b63> it = t422.f185481e.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    C64253b63 next = it.next();
                    if (next.f182215e.mo123705h().hashCode() != s422.BaseRequest.f259572f.mo123705h().hashCode()) {
                        C75555b bVar = new C75555b();
                        bVar.f182214d = next.f182214d;
                        bVar.f182215e = next.f182215e;
                        bVar.f182216f = next.f182216f;
                        bVar.f182217g = next.f182217g;
                        bVar.f182218h = next.f182218h;
                        bVar.f182219i = next.f182219i;
                        bVar.f182220j = next.f182220j;
                        bVar.f182221n = next.f182221n;
                        bVar.f182222o = next.f182222o;
                        int i7 = f221955j;
                        bVar.f221970x = (i7 & 512) != 0;
                        bVar.f221971y = (i7 & 32) != 0;
                        bVar.f221972z = (i7 & 1024) != 0;
                        bVar.f221959A = (next.f182218h & 4) != 0;
                        bVar.f221960B = (i7 & 2048) != 0;
                        bVar.f221961C = (i7 & 4096) != 0;
                        Map<String, String> parseXml2 = XmlParser.parseXml(next.f182216f, "wording", (String) null);
                        if (parseXml2 != null) {
                            bVar.f221962p = parseXml2.get(".wording.title");
                            String str2 = parseXml2.get(".wording.notify");
                            bVar.f221963q = parseXml2.get(".wording.mute_title");
                            String str3 = parseXml2.get(".wording.mute_tips");
                            bVar.f221964r = parseXml2.get(".wording.exit_confirm");
                            bVar.f221965s = parseXml2.get(".wording.lock_title");
                            bVar.f221966t = parseXml2.get(".wording.mute_lock_title");
                            bVar.f221967u = parseXml2.get(".wording.exit");
                            bVar.f221968v = parseXml2.get(".wording.usage_link");
                            bVar.f221969w = parseXml2.get(".wording.autologin_switch_tip");
                        }
                        Log.m105925i("MicroMsg.NetSceneGetOnlineInfo", "fromOnlineInfoToLocalOnlineInfo %s", Integer.valueOf(bVar.f182221n));
                        if (bVar.f182221n == 0) {
                            bVar.f182221n = f221954i;
                        }
                        f221952g.add(bVar);
                        if (z) {
                            int i8 = next.f182214d;
                            f221956n = i8;
                            Log.m105925i("MicroMsg.NetSceneGetOnlineInfo", "device type %d", Integer.valueOf(i8));
                            Log.m105918d("MicroMsg.NetSceneGetOnlineInfo", next.f182216f);
                            f221957o = next.f182220j;
                            z = false;
                        }
                    }
                }
                ArrayList<C75555b> arrayList = new ArrayList<>();
                Iterator<C75555b> it4 = f221952g.iterator();
                while (it4.hasNext()) {
                    C75555b next2 = it4.next();
                    int i9 = next2.f182221n;
                    if (i9 == 1 || i9 == 2) {
                        arrayList.add(next2);
                    }
                }
                Iterator<C75555b> it5 = f221952g.iterator();
                while (it5.hasNext()) {
                    C75555b next3 = it5.next();
                    int i15 = next3.f182221n;
                    if (i15 == 3 || i15 == 8) {
                        arrayList.add(next3);
                    }
                }
                Iterator<C75555b> it6 = f221952g.iterator();
                while (it6.hasNext()) {
                    C75555b next4 = it6.next();
                    int i16 = next4.f182221n;
                    if (!(i16 == 1 || i16 == 2 || i16 == 3 || i16 == 8 || i16 == 10)) {
                        arrayList.add(next4);
                    }
                }
                Iterator<C75555b> it7 = f221952g.iterator();
                while (it7.hasNext()) {
                    C75555b next5 = it7.next();
                    if (next5.f182221n == 10) {
                        arrayList.add(next5);
                    }
                }
                f221952g = arrayList;
                if (arrayList.size() > 1) {
                    Iterator<C75555b> it8 = f221952g.iterator();
                    while (it8.hasNext()) {
                        C75555b next6 = it8.next();
                        int i17 = next6.f182222o;
                        next6.f221970x = (i17 & 512) != 0;
                        next6.f221971y = (i17 & 32) != 0;
                        next6.f221972z = (i17 & 1024) != 0;
                        next6.f221960B = (i17 & 2048) != 0;
                        next6.f221961C = (i17 & 4096) != 0;
                    }
                }
                if (m1 != m90590m1()) {
                    C86709a0.m107528h();
                    C86709a0.m107523b().mo121122w();
                }
            }
            int i18 = t422.f185483g;
            int i19 = t422.f185484h;
            Class cls = C75700k0.class;
            if ((i18 & 64) != 0 || 7 == i19 || 13 == i19 || 8 == i19) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("filehelper");
                if (z1Var == null || Util.isNullOrNil(z1Var.getUsername())) {
                    C45609f2.m50669a(z1Var);
                    z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("filehelper");
                }
                if (z1Var != null && !z1Var.mo62927s3()) {
                    z1Var.mo62868O3();
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
                }
                C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("filehelper");
                if (j == null) {
                    C72976h2 h2Var = new C72976h2("filehelper");
                    h2Var.mo108793N2(Util.nowMilliSecond());
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var);
                } else {
                    j.mo108793N2(Util.nowMilliSecond());
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "filehelper");
                }
            }
        }
        this.f221958d.onSceneEnd(i4, i5, str, this);
    }
}
