package t22;

import android.os.Looper;
import android.os.Message;
import cc0.C92411b;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import eb0.C75592q0;
import ed0.C75607a;
import ed0.C75608b;
import ed0.C75610d;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ol0.C117813j;
import p702ts.C78085c;
import rm0.C90021d;
import s22.C77611a;
import s22.C77612b;
import t22.C118351p;
import te3.C118428eq3;
import te3.C118475vf3;
import te3.C49966ja;
import te3.C51941x90;
import te3.ep4;
import te3.ii4;
import w22.C118722c;
import w22.C53073a;
import w22.C53074b;

/* renamed from: t22.y */
public class C118355y implements C11385n, C75608b {

    /* renamed from: A */
    public long f353730A = 0;

    /* renamed from: B */
    public long f353731B = 0;

    /* renamed from: C */
    public double f353732C = -1000.0d;

    /* renamed from: D */
    public double f353733D = -1000.0d;

    /* renamed from: E */
    public int f353734E = -1;

    /* renamed from: F */
    public MMHandler f353735F = new C118356a(Looper.getMainLooper());

    /* renamed from: G */
    public C92411b.C92412a f353736G = new C118357b();

    /* renamed from: H */
    public C118351p.C118353b f353737H = new C118358c();

    /* renamed from: d */
    public int f353738d = 0;

    /* renamed from: e */
    public int f353739e = 1000;

    /* renamed from: f */
    public C92411b f353740f;

    /* renamed from: g */
    public C118351p f353741g;

    /* renamed from: h */
    public HashSet<WeakReference<C118360e>> f353742h = new HashSet<>();

    /* renamed from: i */
    public String f353743i;

    /* renamed from: j */
    public int f353744j = 1;

    /* renamed from: n */
    public int f353745n;

    /* renamed from: o */
    public ep4 f353746o;

    /* renamed from: p */
    public LocationInfo f353747p = new LocationInfo(false);

    /* renamed from: q */
    public boolean f353748q = false;

    /* renamed from: r */
    public boolean f353749r = false;

    /* renamed from: s */
    public boolean f353750s = false;

    /* renamed from: t */
    public int f353751t = this.f353744j;

    /* renamed from: u */
    public String f353752u = "";

    /* renamed from: v */
    public boolean f353753v = false;

    /* renamed from: w */
    public boolean f353754w = false;

    /* renamed from: x */
    public C118359d f353755x = null;

    /* renamed from: y */
    public int f353756y = -1;

    /* renamed from: z */
    public boolean f353757z = true;

    /* renamed from: t22.y$a */
    public class C118356a extends MMHandler {
        public C118356a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null) {
                C118355y yVar = C118355y.this;
                yVar.getClass();
                if (message.what == 1) {
                    yVar.mo183161d();
                }
            }
        }
    }

    /* renamed from: t22.y$b */
    public class C118357b implements C92411b.C92412a {
        public C118357b() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            C118475vf3 vf32;
            if (!z) {
                return false;
            }
            Log.m105919d("MicorMsg.TrackRefreshManager", "onGetlocatoin fLongitude:%f, fLatitude:%f, locType:%d, speed:%f", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Double.valueOf(d));
            C118355y yVar = C118355y.this;
            if (yVar.f353757z) {
                yVar.f353757z = false;
                yVar.f353731B = System.currentTimeMillis();
                C118355y yVar2 = C118355y.this;
                long j = yVar2.f353731B - yVar2.f353730A;
                Log.m105919d("MicorMsg.TrackRefreshManager", "locate time:%d", Long.valueOf(j));
                C115669n.INSTANCE.mo160131h(10997, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "", 0, Long.valueOf(j));
            }
            ep4 ep4 = C118355y.this.f353746o;
            if (!(ep4 == null || (vf32 = ep4.f353979e) == null)) {
                vf32.f354500d = (double) f2;
                vf32.f354501e = (double) f;
            }
            return true;
        }
    }

    /* renamed from: t22.y$c */
    public class C118358c implements C118351p.C118353b {
        public C118358c() {
        }

        /* renamed from: a */
        public void mo183155a(double d) {
            ep4 ep4 = C118355y.this.f353746o;
            if (ep4 != null) {
                ep4.f353979e.f354502f = d;
            }
        }
    }

    /* renamed from: t22.y$d */
    public interface C118359d {
    }

    /* renamed from: t22.y$e */
    public interface C118360e {
        /* renamed from: a */
        void mo175548a(int i, String str);

        /* renamed from: b */
        void mo175549b();

        /* renamed from: c */
        void mo175550c();

        /* renamed from: d */
        void mo175551d(C118428eq3 eq32);
    }

    /* renamed from: a */
    public void mo183158a(int i) {
        C77611a d;
        Log.m105924i("MicorMsg.TrackRefreshManager", "track endTrack");
        if (mo183160c()) {
            String str = this.f353743i;
            Log.m105919d("MicorMsg.TrackRefreshManager", "exitTrack, scene=%d", Integer.valueOf(i));
            C53073a aVar = new C53073a(str);
            ((C51941x90) aVar.f148134e.f127055a.f127080a).f144530e = i;
            C86709a0.m107524d().mo123460f(aVar);
            this.f353743i = "";
        }
        if (!Util.isNullOrNil(this.f353752u) && (d = C77832s.Bx0().mo107951d(this.f353752u)) != null) {
            d.f226268e.remove(C75592q0.m90789s());
            C77832s.Bx0().mo107956i(this.f353752u, d.f226268e, d.f226270g, d.f226269f, d.f226271h, (String) null, (String) null);
        }
        C77833z Bx0 = C77832s.Bx0();
        C77612b bVar = Bx0.f226791b;
        if (bVar != null) {
            bVar.f226274e = "";
        }
        Bx0.mo107952e(bVar);
        this.f353743i = "";
        this.f353752u = "";
        this.f353748q = false;
        this.f353749r = false;
        this.f353732C = -1000.0d;
        this.f353733D = -1000.0d;
        this.f353734E = -1;
        this.f353756y = -1;
    }

    /* renamed from: b */
    public boolean mo183159b() {
        return mo183160c() && this.f353748q;
    }

    /* renamed from: c */
    public boolean mo183160c() {
        return !Util.isNullOrNil(this.f353743i);
    }

    /* renamed from: d */
    public final void mo183161d() {
        boolean z = true;
        if (!this.f353750s || !this.f353748q || this.f353747p == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("error to exit refresh isStart: ");
            sb.append(this.f353750s);
            sb.append(" isShared: ");
            sb.append(this.f353748q);
            sb.append(" ");
            if (this.f353747p != null) {
                z = false;
            }
            sb.append(z);
            Log.m105920e("MicorMsg.TrackRefreshManager", sb.toString());
            return;
        }
        ep4 ep4 = this.f353746o;
        if (ep4 != null) {
            C118475vf3 vf32 = ep4.f353979e;
            if (!(vf32.f354500d == -1000.0d || vf32.f354501e == -1000.0d)) {
                String s = C75592q0.m90789s();
                ii4 ii4 = new ii4();
                LocationInfo locationInfo = this.f353747p;
                ii4.f354058g = locationInfo.f271933h;
                ii4.f354055d = locationInfo.f271930e;
                ii4.f354056e = locationInfo.f271931f;
                ii4.f354057f = s;
                ep4 ep42 = this.f353746o;
                ep42.f353978d = s;
                ep42.f353979e.f354502f = C77832s.xx0().mo183151a();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("refreshLoopImpl, [trackRoomId:" + this.f353743i + "]");
                int i = this.f353744j;
                if (i == 0) {
                    stringBuffer.append("track upload_status  MMRefreshTrackRoomUpload ");
                } else if (i == 1) {
                    stringBuffer.append("track upload_status  MMRefreshTrackRoomDownload ");
                } else if (i == 2) {
                    stringBuffer.append("track upload_status  MMRefreshTrackRoomUploadAndDownLoad ");
                } else if (i == 3) {
                    stringBuffer.append("track upload_status  MMRefreshTrackRoomFirstUpload ");
                    stringBuffer.append("[ trackItem " + ii4.f354055d + " " + ii4.f354056e + " ]");
                }
                stringBuffer.append("[ mMyPosiItem " + this.f353746o.f353979e.f354500d + " " + this.f353746o.f353979e.f354501e + " " + this.f353746o.f353979e.f354502f + " ]");
                Log.m105918d("MicorMsg.TrackRefreshManager", stringBuffer.toString());
                String str = this.f353743i;
                int i2 = this.f353744j;
                ep4 ep43 = this.f353746o;
                int i3 = this.f353745n + 1;
                this.f353745n = i3;
                C86709a0.m107524d().mo123460f(new C118722c(str, i2, ep43, i3, ii4));
                return;
            }
        }
        Log.m105920e("MicorMsg.TrackRefreshManager", "error to get my location ");
        this.f353735F.sendEmptyMessageDelayed(1, (long) this.f353739e);
    }

    /* renamed from: e */
    public void mo183162e() {
        Log.m105918d("MicorMsg.TrackRefreshManager", "resume refresh");
        this.f353754w = false;
        Log.m105918d("MicorMsg.TrackRefreshManager", "trigerRefresh");
        if (mo183160c()) {
            Log.m105918d("MicorMsg.TrackRefreshManager", "trigerRefresh, joinSuccess");
            C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
            this.f353740f = ms;
            ms.mo126412f(this.f353736G, true);
            if (this.f353741g == null) {
                this.f353741g = C77832s.xx0();
            }
            this.f353741g.mo183152b(this.f353737H);
            mo183161d();
        }
    }

    /* renamed from: f */
    public void mo183163f() {
        Log.m105924i("MicorMsg.TrackRefreshManager", "stop location");
        C92411b bVar = this.f353740f;
        if (bVar != null) {
            bVar.mo126408b(this.f353736G);
        }
        C118351p pVar = this.f353741g;
        if (pVar != null) {
            pVar.mo183154d(this.f353737H);
        }
        C86709a0.m107524d().mo123470p(C117813j.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(490, this);
        C86709a0.m107524d().mo123470p(C90021d.CTRL_INDEX, this);
        this.f353744j = 1;
        this.f353750s = false;
        this.f353756y = -1;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49966ja jaVar;
        C49966ja jaVar2;
        HashSet<WeakReference<C118360e>> hashSet;
        boolean z = false;
        Log.m105919d("MicorMsg.TrackRefreshManager", "onSceneEnd scene type %d errType %d errCode %d", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar.getType() == 490) {
            if (i2 == 0 || i2 >= 1000) {
                this.f353743i = ((C53074b) yVar).f148137f;
                C77833z Bx0 = C77832s.Bx0();
                String str2 = this.f353743i;
                C77612b bVar = Bx0.f226791b;
                if (bVar != null) {
                    bVar.f226274e = str2;
                }
                Bx0.mo107952e(bVar);
                if (mo183160c()) {
                    Log.m105925i("MicorMsg.TrackRefreshManager", "join sucess %s", this.f353743i);
                    LinkedList<String> c = ((C77833z) C75610d.m90859a()).mo107950c(this.f353752u);
                    c.add(C75592q0.m90789s());
                    if (this.f353747p != null) {
                        C75607a a = C75610d.m90859a();
                        String str3 = this.f353752u;
                        LocationInfo locationInfo = this.f353747p;
                        ((C77833z) a).mo107956i(str3, c, locationInfo.f271930e, locationInfo.f271931f, locationInfo.f271933h, "", "");
                    } else {
                        ((C77833z) C75610d.m90859a()).mo107956i(this.f353752u, c, -1000.0d, -1000.0d, "", "", "");
                    }
                    HashSet<WeakReference<C118360e>> hashSet2 = this.f353742h;
                    if (hashSet2 != null) {
                        Iterator<WeakReference<C118360e>> it = hashSet2.iterator();
                        while (it.hasNext()) {
                            WeakReference next = it.next();
                            if (!(next == null || next.get() == null)) {
                                ((C118360e) next.get()).mo175549b();
                            }
                        }
                    }
                    mo183161d();
                    return;
                }
                return;
            }
            if (i2 == 17 && (hashSet = this.f353742h) != null) {
                Iterator<WeakReference<C118360e>> it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    WeakReference next2 = it4.next();
                    if (!(next2 == null || next2.get() == null)) {
                        ((C118360e) next2.get()).mo175550c();
                    }
                }
            }
            HashSet<WeakReference<C118360e>> hashSet3 = this.f353742h;
            if (hashSet3 != null) {
                Iterator<WeakReference<C118360e>> it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    WeakReference next3 = it5.next();
                    if (!(next3 == null || next3.get() == null)) {
                        ((C118360e) next3.get()).mo175548a(0, ((C53074b) yVar).f148138g);
                    }
                }
            }
        } else if (i == 0 && i2 == 0) {
            if (yVar.getType() == 492) {
                C118722c cVar = (C118722c) yVar;
                C118428eq3 eq32 = cVar.f355243i;
                if (!(eq32 == null || (jaVar2 = eq32.BaseResponse) == null)) {
                    if (jaVar2.f135955d == 12) {
                        this.f353753v = true;
                        C118359d dVar = this.f353755x;
                        if (dVar != null) {
                            ((RealTimeLocationUI.C115533b) dVar).mo175552a();
                        }
                    } else {
                        this.f353753v = false;
                    }
                    Log.m105919d("MicorMsg.TrackRefreshManager", "refresh track room, timeout = %b, ret = %d", Boolean.valueOf(this.f353753v), Integer.valueOf(eq32.BaseResponse.f135955d));
                }
                int i3 = this.f353738d;
                if (i3 > 0) {
                    C115669n.INSTANCE.mo160131h(10997, "9", "", Integer.valueOf(i3), 0);
                }
                this.f353738d = 0;
                this.f353739e = cVar.f355241g;
                int i4 = cVar.f355244j;
                HashSet<WeakReference<C118360e>> hashSet4 = this.f353742h;
                if (hashSet4 != null && (i4 == 2 || i4 == 1 || i4 == 3)) {
                    Iterator<WeakReference<C118360e>> it6 = hashSet4.iterator();
                    while (it6.hasNext()) {
                        WeakReference next4 = it6.next();
                        if (!(next4 == null || next4.get() == null)) {
                            ((C118360e) next4.get()).mo175551d(cVar.f355243i);
                        }
                    }
                }
                int i5 = this.f353744j;
                if (i5 == 1) {
                    z = true;
                }
                if (!z) {
                    if (i5 == 1) {
                        this.f353744j = 3;
                    } else if (i5 == 3) {
                        this.f353744j = 2;
                    }
                }
                this.f353735F.removeMessages(1);
                if (mo183160c() && !this.f353754w && !this.f353753v) {
                    this.f353735F.sendEmptyMessageDelayed(1, (long) this.f353739e);
                }
            } else if (yVar.getType() == 491) {
                C77833z Bx02 = C77832s.Bx0();
                C77612b bVar2 = Bx02.f226791b;
                if (bVar2 != null) {
                    bVar2.f226274e = "";
                }
                Bx02.mo107952e(bVar2);
            }
        } else if (yVar.getType() == 492) {
            this.f353738d++;
            this.f353735F.removeMessages(1);
            if (this.f353738d >= 10) {
                this.f353735F.removeMessages(1);
                HashSet<WeakReference<C118360e>> hashSet5 = this.f353742h;
                if (hashSet5 != null) {
                    Iterator<WeakReference<C118360e>> it7 = hashSet5.iterator();
                    while (it7.hasNext()) {
                        WeakReference next5 = it7.next();
                        if (!(next5 == null || next5.get() == null)) {
                            ((C118360e) next5.get()).mo175548a(1, ((C118722c) yVar).f355240f);
                        }
                    }
                }
            } else if (mo183160c() && !this.f353754w) {
                C118428eq3 eq33 = ((C118722c) yVar).f355243i;
                if (!(eq33 == null || (jaVar = eq33.BaseResponse) == null)) {
                    if (jaVar.f135955d == 12) {
                        this.f353753v = true;
                        C118359d dVar2 = this.f353755x;
                        if (dVar2 != null) {
                            ((RealTimeLocationUI.C115533b) dVar2).mo175552a();
                        }
                    } else {
                        this.f353753v = false;
                    }
                    Log.m105919d("MicorMsg.TrackRefreshManager", "refresh track room, in error status, timeout = %b, ret = %d", Boolean.valueOf(this.f353753v), Integer.valueOf(eq33.BaseResponse.f135955d));
                }
                if (!this.f353753v) {
                    this.f353735F.sendEmptyMessageDelayed(1, (long) this.f353739e);
                }
            }
        }
    }
}
