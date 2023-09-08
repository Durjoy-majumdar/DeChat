package com.tencent.p014mm.plugin.multitalk.model;

import android.content.Context;
import android.content.IntentFilter;
import androidx.exifinterface.media.ExifInterface;
import as3.C103907w;
import as3.C103909x;
import bs3.C104161b;
import bs3.C104162c;
import bs3.C104164e;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82993v;
import com.tencent.p014mm.plugin.multi.talk;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.voip.model.C106333b;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.VoipModelResMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.FileUtils;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import ds3.C107062b;
import ds3.C107063c;
import ds3.C107064d;
import ds3.C107065e;
import eb0.C75592q0;
import f40.C86709a0;
import fm0.C86940g0;
import h81.C32735h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lv3.C109435e;
import lv3.C109437f;
import lv3.C109439h;
import mv3.C109643b;
import nv3.C109761b;
import nv3.C109763d;
import nw3.C109770a;
import nw3.C109779e;
import nw3.C109782f;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C107823c;
import p156gj.C107835h0;
import p375qh.C110390f;
import p978i9.C108421e;
import pu0.C110248b;
import ql0.C89699b;
import v82.C111425d1;
import v82.C111448f1;
import vn0.C90846d;
import z33.C112597j;
import zr3.C112679g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitalk.model.w */
public class C105845w implements C11385n {

    /* renamed from: d */
    public C107064d f314798d;

    /* renamed from: e */
    public C105823o f314799e;

    /* renamed from: f */
    public C110390f f314800f;

    /* renamed from: g */
    public boolean f314801g;

    /* renamed from: h */
    public C107063c f314802h;

    /* renamed from: i */
    public C107062b f314803i;

    /* renamed from: j */
    public int f314804j = 0;

    /* renamed from: n */
    public C110390f.C89659b f314805n = new C105847b();

    /* renamed from: o */
    public C106333b f314806o = new C105848c();

    /* renamed from: p */
    public MTimerHandler f314807p;

    /* renamed from: q */
    public volatile HashMap<String, Integer> f314808q = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.multitalk.model.w$a */
    public class C105846a implements C107065e {
        public C105846a() {
        }

        /* renamed from: a */
        public int mo150831a(int i, int i2, C107062b bVar) {
            int i3;
            C105845w wVar = C105845w.this;
            wVar.f314803i = bVar;
            C105823o oVar = wVar.f314799e;
            C106333b bVar2 = wVar.f314806o;
            synchronized (oVar.f314736b) {
                i3 = -1;
                if (oVar.f314737c) {
                    Log.m105918d("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay, already start");
                } else {
                    Log.m105925i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlay %s", Integer.valueOf(oVar.hashCode()));
                    if (oVar.f314735a == null) {
                        int i4 = C107835h0.f322846c.f322693H0;
                        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_flag, -1);
                        Log.m105919d("MicroMsg.MT.MultiTalkAudioPlayer", "MT3D, startPlay, mt3d_flag_s = %d", Integer.valueOf(i4));
                        Log.m105919d("MicroMsg.MT.MultiTalkAudioPlayer", "MT3D, startPlay, mt3d_flag_x = %d", Integer.valueOf(Qe));
                        C106336d dVar = new C106336d();
                        oVar.f314735a = dVar;
                        byte[] bArr = {0};
                        if (i4 <= 0 || Qe <= 0) {
                            dVar.mo152544c(i, 1, i2, 0);
                        } else {
                            bArr[0] = 1;
                            dVar.mo152544c(i, 2, i2, 0);
                        }
                        ((C109779e) C105851w0.xx0().f314798d).mo161038i(FileUtils.S_IRWXU, bArr, 1);
                    }
                    oVar.f314735a.mo152543b(MMApplicationContext.getContext(), false);
                    oVar.f314735a.f317212q = bVar2;
                    if (C105851w0.zx0().f314469K != null) {
                        C105851w0.zx0().f314469K.mo146016h0();
                        C105851w0.zx0().f314469K.f308783l = oVar.f314735a;
                    }
                    Log.m105924i("MicroMsg.MT.MultiTalkAudioPlayer", "set start play");
                    oVar.f314737c = true;
                    oVar.f314738d.mo72289b();
                    i3 = oVar.f314735a.mo152545d();
                    Log.m105924i("MicroMsg.MT.MultiTalkAudioPlayer", "startPlaying cost: " + oVar.f314738d.mo72288a());
                    Log.m105925i("MicroMsg.MT.MultiTalkAudioPlayer", "finish start play: %s", Integer.valueOf(i3));
                }
            }
            C105845w.this.mo150828h();
            C110248b.C110249a aVar = C110248b.f329777h;
            Log.m105925i("MicroMsg.MT.MultiTalkEngine", "isSpeakerOn=%b isHandsFree=%b", Boolean.valueOf(aVar.mo161667l()), Boolean.valueOf(C105851w0.zx0().f314494f));
            if (aVar.mo161667l() != C105851w0.zx0().f314494f && C105851w0.zx0().mo150624A() && C105851w0.zx0().f314469K != null && !C105851w0.zx0().f314469K.mo161475Q()) {
                C105851w0.zx0().f314469K.mo146012d0(C105851w0.zx0().f314494f);
            }
            return i3;
        }

        /* renamed from: b */
        public int mo150832b(int i, int i2, C107063c cVar) {
            C105845w wVar = C105845w.this;
            wVar.f314802h = cVar;
            wVar.f314800f = new C110390f(i, 1, 7);
            C105845w.this.f314800f.mo161902g(i2);
            C105845w.this.f314800f.mo161905j(true);
            C105845w.this.f314800f.mo161901f(true);
            C110390f fVar = C105845w.this.f314800f;
            fVar.f330234m = -19;
            fVar.mo161903h(1, false);
            C105845w.this.f314800f.mo161904i(true);
            C105845w wVar2 = C105845w.this;
            C110390f fVar2 = wVar2.f314800f;
            fVar2.f330245x = wVar2.f314805n;
            return fVar2.mo161906k() ? 1 : -1;
        }

        /* renamed from: c */
        public boolean mo150833c() {
            Log.m105924i("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkPlayer");
            C105823o oVar = C105845w.this.f314799e;
            synchronized (oVar.f314736b) {
                Log.m105925i("MicroMsg.MT.MultiTalkAudioPlayer", "stopPlay, isStart: %s %s", Boolean.valueOf(oVar.f314737c), Integer.valueOf(oVar.hashCode()));
                if (oVar.f314737c) {
                    C106336d dVar = oVar.f314735a;
                    if (dVar != null) {
                        oVar.f314738d.mo72289b();
                        dVar.mo152546e();
                        Log.m105924i("MicroMsg.MT.MultiTalkAudioPlayer", "stopPlaying cost: " + oVar.f314738d.mo72288a());
                        dVar.mo152547f();
                        oVar.f314737c = false;
                        oVar.f314735a = null;
                    }
                    if (C105851w0.zx0().f314469K != null) {
                        C105851w0.zx0().f314469K.mo146011B();
                    }
                }
            }
            C105845w.this.mo150829i();
            return true;
        }

        /* renamed from: d */
        public boolean mo150834d() {
            Log.m105924i("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkRecord");
            try {
                C110390f fVar = C105845w.this.f314800f;
                if (fVar != null) {
                    fVar.f330245x = null;
                    fVar.mo161907l();
                }
                C105845w.this.f314800f = null;
                return true;
            } catch (Exception e) {
                Log.m105928w("MicroMsg.MT.MultiTalkEngine", "stopMultiTalkPlayer :" + e);
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.w$b */
    public class C105847b implements C110390f.C89659b {
        public C105847b() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            if (i <= 0) {
                Log.m105920e("MicroMsg.MT.MultiTalkEngine", "pcm data len <= 0");
                return;
            }
            C107063c cVar = C105845w.this.f314802h;
            if (cVar != null) {
                C109782f.C109788d dVar = (C109782f.C109788d) cVar;
                dVar.getClass();
                try {
                    C109782f fVar = C109782f.this;
                    if (fVar.f328590j) {
                        if (fVar.f328570Q0) {
                            for (int i2 = 0; i2 < bArr.length; i2++) {
                                bArr[i2] = 0;
                            }
                        }
                        C109782f fVar2 = C109782f.this;
                        if (fVar2.f328590j) {
                            short s = (short) i;
                            talk talk = fVar2.f328564K.f328532a;
                            if (talk != null) {
                                talk.SendAudio(bArr, s, 0);
                            }
                            C109782f fVar3 = C109782f.this;
                            if (fVar3.f328580W) {
                                fVar3.f328580W = false;
                                C104161b.m138997f("TalkRoomService", "onRecPcmDataCallBack len: ", Integer.valueOf(i));
                            }
                        }
                    }
                } catch (Exception e) {
                    C104161b.m138997f("TalkRoomService", "initMediaComponent record", e);
                }
                C105845w wVar = C105845w.this;
                int i3 = i / 2;
                wVar.getClass();
                short[] sArr = new short[i3];
                for (int i4 = 0; i3 > i4; i4++) {
                    int i5 = i4 * 2;
                    sArr[i4] = (short) (((bArr[i5 + 1] & ExifInterface.MARKER) << 8) | (bArr[i5] & ExifInterface.MARKER));
                }
                wVar.getClass();
                float f = 0.0f;
                for (int i6 = 0; i6 < i3; i6++) {
                    short s2 = sArr[i6];
                    f += (float) (s2 * s2);
                }
                if (Math.sqrt((double) (f / ((float) i3))) > 50.0d) {
                    C105845w wVar2 = C105845w.this;
                    wVar2.f314801g = false;
                    wVar2.f314804j = 0;
                    return;
                }
                C105845w wVar3 = C105845w.this;
                int i7 = wVar3.f314804j + 1;
                wVar3.f314804j = i7;
                if (i7 >= 30) {
                    wVar3.f314801g = true;
                }
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105925i("MicroMsg.MT.MultiTalkEngine", "OnPcmRecListener onRecError %d %d", Integer.valueOf(i), Integer.valueOf(i2));
            C105851w0.zx0().getClass();
            C111425d1 Cx0 = C105851w0.Cx0();
            if (Cx0.f333586d != null && !Cx0.f333589g) {
                ((C119157j) C119157j.f356862d).mo183894y("showIcon");
                ((C119157j) C119157j.f356862d).mo183876g(new C111448f1(Cx0), "showIcon");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.w$c */
    public class C105848c implements C106333b {
        public C105848c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo149458a(byte[] r11, int r12) {
            /*
                r10 = this;
                com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105845w.this
                ds3.b r0 = r0.f314803i
                r1 = -1
                r2 = 0
                if (r0 == 0) goto L_0x005a
                nw3.f$e r0 = (nw3.C109782f.C109789e) r0
                java.lang.String r3 = "TalkRoomService"
                nw3.f r4 = nw3.C109782f.this
                boolean r5 = r4.f328590j
                if (r5 != 0) goto L_0x0013
                goto L_0x005a
            L_0x0013:
                r5 = 2
                r6 = 1
                nw3.b r4 = r4.f328564K     // Catch:{ Exception -> 0x004c }
                short r7 = (short) r12     // Catch:{ Exception -> 0x004c }
                java.util.concurrent.atomic.AtomicInteger r8 = r0.f328632a     // Catch:{ Exception -> 0x004c }
                java.util.concurrent.atomic.AtomicInteger r9 = r0.f328633b     // Catch:{ Exception -> 0x004c }
                com.tencent.mm.plugin.multi.talk r4 = r4.f328532a     // Catch:{ Exception -> 0x004c }
                if (r4 != 0) goto L_0x0022
                r11 = 1
                goto L_0x0026
            L_0x0022:
                int r11 = r4.GetAudioData(r11, r7, r8, r9)     // Catch:{ Exception -> 0x004c }
            L_0x0026:
                nw3.f r0 = nw3.C109782f.this     // Catch:{ Exception -> 0x004c }
                boolean r4 = r0.f328581X     // Catch:{ Exception -> 0x004c }
                if (r4 == 0) goto L_0x005b
                if (r11 < 0) goto L_0x005b
                r0.f328581X = r2     // Catch:{ Exception -> 0x004c }
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x004c }
                java.lang.String r4 = "onPlayPcmDataCallBack len: "
                r0[r2] = r4     // Catch:{ Exception -> 0x004c }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x004c }
                r0[r6] = r12     // Catch:{ Exception -> 0x004c }
                java.lang.String r12 = " ret: "
                r0[r5] = r12     // Catch:{ Exception -> 0x004c }
                r12 = 3
                java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x004c }
                r0[r12] = r4     // Catch:{ Exception -> 0x004c }
                bs3.C104161b.m138997f(r3, r0)     // Catch:{ Exception -> 0x004c }
                goto L_0x005b
            L_0x004c:
                r11 = move-exception
                java.lang.Object[] r12 = new java.lang.Object[r5]
                java.lang.String r0 = "initMediaComponent play"
                r12[r2] = r0
                r12[r6] = r11
                bs3.C104161b.m138997f(r3, r12)
                r11 = -1
                goto L_0x005b
            L_0x005a:
                r11 = 0
            L_0x005b:
                if (r11 >= 0) goto L_0x005e
                return r1
            L_0x005e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105845w.C105848c.mo149458a(byte[], int):int");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.w$d */
    public class C105849d implements Comparator<Map.Entry<String, Integer>> {
        public C105849d(C105845w wVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((Integer) ((Map.Entry) obj2).getValue()).intValue() - ((Integer) ((Map.Entry) obj).getValue()).intValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.w$e */
    public class C105850e implements MTimerHandler.CallBack {
        public C105850e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r14 = this;
                com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105845w.this
                java.util.List r1 = r0.mo150821a()
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.pb.talkroom.sdk.MultiTalkGroup r4 = r4.f314506t
                r3.getClass()
                r5 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r7 = 1
                if (r4 != 0) goto L_0x0022
                goto L_0x00d0
            L_0x0022:
                java.lang.String r8 = r4.f320042d
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r9 == 0) goto L_0x002c
                java.lang.String r8 = r4.f320043e
            L_0x002c:
                java.lang.String r4 = r4.f320044f
                boolean r3 = r3.mo150681w(r4)
                r4 = 2
                if (r3 == 0) goto L_0x008b
                com.tencent.mm.plugin.multitalk.ilinkservice.z r3 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
                com.tencent.mm.plugin.multitalk.ilinkservice.s r8 = r3.f314388f
                java.util.ArrayList r8 = r8.mo150549a()
                java.util.HashMap r9 = new java.util.HashMap
                r9.<init>()
                if (r8 == 0) goto L_0x00d0
                int r10 = r8.size()
                if (r10 != 0) goto L_0x004c
                goto L_0x00d0
            L_0x004c:
                int r3 = r3.f314401n
                if (r3 == r7) goto L_0x0052
                goto L_0x00d0
            L_0x0052:
                java.util.Iterator r3 = r8.iterator()
            L_0x0056:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x0128
                java.lang.Object r8 = r3.next()
                com.tencent.mm.plugin.multitalk.ilinkservice.r r8 = (com.tencent.p014mm.plugin.multitalk.ilinkservice.C105683r) r8
                int r10 = r8.f314237a
                com.tencent.wxmm.v2conference r11 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
                int r10 = r11.GetVoiceActivity(r10)
                if (r10 <= 0) goto L_0x0056
                java.lang.Object[] r11 = new java.lang.Object[r4]
                int r12 = r8.f314237a
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r5] = r12
                java.lang.String r12 = r8.f314239c
                r11[r7] = r12
                java.lang.String r12 = "MicroMsg.Multitalk.ILinkService"
                java.lang.String r13 = "getTalkingEnergyMember, memberId:%d,memberName:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r11)
                java.lang.String r8 = r8.f314239c
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9.put(r8, r10)
                goto L_0x0056
            L_0x008b:
                com.tencent.mm.plugin.multitalk.model.w r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()
                ds3.d r3 = r3.f314798d
                nw3.e r3 = (nw3.C109779e) r3
                r3.getClass()
                nw3.f r3 = nw3.C109770a.m149092a()
                java.lang.String r3 = r3.f328593p
                boolean r3 = bs3.C104166f.m139003c(r8, r3)
                if (r3 != 0) goto L_0x00b9
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r9 = "getTalkingEnergyMember groupid is not same; multiTalkGroupid: "
                r3[r5] = r9
                r3[r7] = r8
                nw3.f r5 = nw3.C109770a.m149092a()
                java.lang.String r5 = r5.f328593p
                r3[r4] = r5
                java.lang.String r4 = "TalkRoomSdkApi"
                bs3.C104161b.m138997f(r4, r3)
                goto L_0x00d0
            L_0x00b9:
                nw3.c r3 = nw3.C109774c.m149103b()
                com.tencent.wecall.talkroom.model.TalkRoom r3 = r3.mo161020h(r8)
                if (r3 != 0) goto L_0x00d2
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r4 = "getTalkingMember talkroom is null: groupId: "
                r3[r5] = r4
                r3[r7] = r8
                java.lang.String r4 = "TalkRoomManager"
                bs3.C104161b.m138997f(r4, r3)
            L_0x00d0:
                r9 = 0
                goto L_0x0128
            L_0x00d2:
                java.util.ArrayList r4 = new java.util.ArrayList
                java.util.Map<java.lang.String, nw3.d> r3 = r3.f320125n
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
                java.util.Collection r3 = r3.values()
                r4.<init>(r3)
                java.util.HashMap r9 = new java.util.HashMap
                r9.<init>()
                java.util.Iterator r3 = r4.iterator()
            L_0x00e8:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0128
                java.lang.Object r4 = r3.next()
                nw3.d r4 = (nw3.C109777d) r4
                if (r4 != 0) goto L_0x00f7
                goto L_0x00e8
            L_0x00f7:
                nw3.f r5 = nw3.C109770a.m149092a()
                as3.b1 r8 = r4.f328542a
                if (r8 != 0) goto L_0x0101
                r8 = -1
                goto L_0x0103
            L_0x0101:
                int r8 = r8.f306893f
            L_0x0103:
                nw3.b r5 = r5.f328564K
                if (r5 == 0) goto L_0x0115
                com.tencent.mm.plugin.multi.talk r5 = r5.f328532a
                if (r5 != 0) goto L_0x010c
                goto L_0x0115
            L_0x010c:
                int r5 = r5.GetVoiceActivity(r8)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0116
            L_0x0115:
                r5 = r6
            L_0x0116:
                int r5 = r5.intValue()
                if (r5 <= 0) goto L_0x00e8
                java.lang.String r4 = r4.mo161024a()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r9.put(r4, r5)
                goto L_0x00e8
            L_0x0128:
                if (r9 == 0) goto L_0x0197
                java.util.Set r3 = r9.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x0132:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x015b
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                r8 = r1
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                boolean r5 = r8.contains(r5)
                if (r5 != 0) goto L_0x0132
                java.lang.Object r5 = r4.getKey()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r4 = r4.getValue()
                java.lang.Integer r4 = (java.lang.Integer) r4
                r2.put(r5, r4)
                goto L_0x0132
            L_0x015b:
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0161:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0197
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r4 = r9.containsKey(r3)
                if (r4 != 0) goto L_0x0193
                java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r0.f314808q
                java.lang.Object r4 = r4.get(r3)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 != 0) goto L_0x017e
                r4 = r6
            L_0x017e:
                int r5 = r4.intValue()
                r8 = 30
                if (r5 >= r8) goto L_0x0161
                int r4 = r4.intValue()
                int r4 = r4 + r7
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2.put(r3, r4)
                goto L_0x0161
            L_0x0193:
                r2.put(r3, r6)
                goto L_0x0161
            L_0x0197:
                r0.f314808q = r2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105845w.C105850e.onTimerExpired():boolean");
        }
    }

    public C105845w() {
        Log.m105924i("MicroMsg.MT.MultiTalkEngine", "init multiTalk engine");
        Context context = MMApplicationContext.getContext();
        if (C109779e.f328545d == null) {
            synchronized (C109779e.class) {
                if (C109779e.f328545d == null) {
                    C109779e.f328545d = new C109779e();
                }
            }
        }
        C109779e eVar = C109779e.f328545d;
        eVar.getClass();
        C104162c.f308396a = context;
        if (C109439h.f327583b == null) {
            synchronized (C109439h.class) {
                if (C109439h.f327583b == null) {
                    C109439h.f327583b = new C109439h();
                }
            }
        }
        C109439h.f327583b.f327584a = context;
        try {
            C109761b d = C109435e.m148613d(new C109763d("EventCenter", C109643b.class.getName(), (String[]) null));
            if (d != null) {
                C109437f fVar = (C109437f) d;
                fVar.f327580b.mo160619e(fVar);
            }
        } catch (Throwable th) {
            C104161b.m138997f("service", th);
        }
        this.f314798d = eVar;
        try {
            C104161b.f308394a = 0;
            C104161b.f308395b = true;
            C104161b.m138997f("TalkRoomSdkApi", "setOpenLog: isOpenSdkLog", Boolean.TRUE, " level: ", 0);
        } catch (Throwable th4) {
            C104161b.m138997f("TalkRoomSdkApi", "setOpenLog: ", th4);
        }
        this.f314799e = new C105823o();
        int nullAsNil = Util.nullAsNil((Integer) C86709a0.m107535s().f251803a.mo119660a(1));
        C107064d dVar = this.f314798d;
        MultiTalkManager zx02 = C105851w0.zx0();
        C105846a aVar = new C105846a();
        C109779e eVar2 = (C109779e) dVar;
        eVar2.getClass();
        Context context2 = C104162c.f308396a;
        if (context2 == null) {
            C104161b.m138997f("TalkRoomSdkApi", "init fail context: ", context2);
        } else {
            try {
                eVar2.mo161039j(zx02, aVar);
                C112679g.m154059e().f337393c = aVar;
                if (C109770a.f328528b == null) {
                    synchronized (C109770a.class) {
                        if (C109770a.f328528b == null) {
                            C109770a.f328528b = new C109770a();
                        }
                    }
                }
                C109770a.f328528b.getClass();
                C104161b.m138993b("MicroMsg.Voip", "registerEvents");
                C109770a.m149092a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.setPriority(Integer.MAX_VALUE);
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                C104162c.f308396a.registerReceiver(eVar2.f328547b, intentFilter);
                C104161b.m138993b("TalkRoomSdkApi", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            } catch (Exception e) {
                C104161b.m138997f("TalkRoomSdkApi", "init ", e);
            }
        }
        ((C109779e) this.f314798d).mo161040k(nullAsNil, C75592q0.m90789s());
        C86709a0.m107524d().mo123455a(1918, this);
        C86709a0.m107524d().mo123455a(1919, this);
        C86709a0.m107524d().mo123455a(1927, this);
        C86709a0.m107524d().mo123455a(1928, this);
        C86709a0.m107524d().mo123455a(1929, this);
        C86709a0.m107524d().mo123455a(1931, this);
        C86709a0.m107524d().mo123455a(1932, this);
        C86709a0.m107524d().mo123455a(1933, this);
        C86709a0.m107524d().mo123455a(1935, this);
        C86709a0.m107524d().mo123455a(1937, this);
        C86709a0.m107524d().mo123455a(1938, this);
        C86709a0.m107524d().mo123455a(1939, this);
    }

    /* renamed from: a */
    public List<String> mo150821a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> key : this.f314808q.entrySet()) {
            arrayList.add((String) key.getKey());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo150822b() {
        Class cls = C32735h.class;
        byte[] bArr = new byte[76];
        int[] iArr = {((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim1, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim2, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim3, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim4, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim5, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim6, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim7, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_azim8, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl1, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl2, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl3, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl4, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl5, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl6, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl7, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_elvl8, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_phi, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_theta1, -1), ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_theta2, -1)};
        C107823c cVar = C107835h0.f322846c;
        int i = cVar.f322695I0;
        if (-1 < i) {
            iArr[0] = (short) i;
        }
        int i2 = cVar.f322697J0;
        if (-1 < i2) {
            iArr[1] = (short) i2;
        }
        int i3 = cVar.f322699K0;
        if (-1 < i3) {
            iArr[2] = (short) i3;
        }
        int i4 = cVar.f322701L0;
        if (-1 < i4) {
            iArr[3] = (short) i4;
        }
        int i5 = cVar.f322703M0;
        if (-1 < i5) {
            iArr[4] = (short) i5;
        }
        int i6 = cVar.f322705N0;
        if (-1 < i6) {
            iArr[5] = (short) i6;
        }
        int i7 = cVar.f322707O0;
        if (-1 < i7) {
            iArr[6] = (short) i7;
        }
        int i8 = cVar.f322709P0;
        if (-1 < i8) {
            iArr[7] = (short) i8;
        }
        int i9 = cVar.f322711Q0;
        if (-1 < i9) {
            iArr[8] = (short) i9;
        }
        int i15 = cVar.f322713R0;
        if (-1 < i15) {
            iArr[9] = (short) i15;
        }
        int i16 = cVar.f322715S0;
        if (-1 < i16) {
            iArr[10] = (short) i16;
        }
        int i17 = cVar.f322717T0;
        if (-1 < i17) {
            iArr[11] = (short) i17;
        }
        int i18 = cVar.f322719U0;
        if (-1 < i18) {
            iArr[12] = (short) i18;
        }
        int i19 = cVar.f322721V0;
        if (-1 < i19) {
            iArr[13] = (short) i19;
        }
        int i25 = cVar.f322723W0;
        if (-1 < i25) {
            iArr[14] = (short) i25;
        }
        int i26 = cVar.f322725X0;
        if (-1 < i26) {
            iArr[15] = (short) i26;
        }
        int i27 = cVar.f322727Y0;
        if (-1 < i27) {
            iArr[16] = (short) i27;
        }
        int i28 = cVar.f322729Z0;
        if (-1 < i28) {
            iArr[17] = (short) i28;
        }
        int i29 = cVar.f322732a1;
        if (-1 < i29) {
            iArr[18] = (short) i29;
        }
        for (int i35 = 0; i35 < 19; i35++) {
            int i36 = i35 * 4;
            int i37 = iArr[i35];
            bArr[i36 + 0] = (byte) (i37 & 255);
            bArr[i36 + 1] = (byte) ((i37 >> 8) & 255);
            bArr[i36 + 2] = (byte) ((i37 >> 16) & 255);
            bArr[i36 + 3] = (byte) ((i37 >> 24) & 255);
        }
        ((C109779e) this.f314798d).mo161038i(447, bArr, 19);
    }

    /* renamed from: c */
    public C107064d mo150823c() {
        return this.f314798d;
    }

    /* renamed from: d */
    public ArrayList<String> mo150824d(int i) {
        int i2 = i + 1;
        ArrayList<String> arrayList = new ArrayList<>(i2);
        ArrayList arrayList2 = new ArrayList(this.f314808q.entrySet());
        Collections.sort(arrayList2, new C105849d(this));
        if (arrayList2.isEmpty()) {
            return null;
        }
        arrayList.add((String) ((Map.Entry) arrayList2.get(0)).getKey());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (arrayList.size() >= i2) {
                break;
            } else if ((C105851w0.zx0().f314503q != null && C105851w0.zx0().f314503q.contains(entry.getKey())) || (C105851w0.zx0().mo150672o().f314613c != null && C105851w0.zx0().mo150672o().f314613c.contains(entry.getKey()))) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo150825e(boolean z) {
        byte[] bArr = {z ? (byte) 1 : 0};
        boolean v = C105851w0.zx0().mo150680v();
        Log.printInfoStack("MicroMsg.MT.MultiTalkEngine", "setEngineHeadsetPlugged, %s, isILinkMode, %s", Boolean.valueOf(z), Boolean.valueOf(v));
        if (v) {
            C105724z.INSTANCE.getClass();
            C105714w.m141918c(425, bArr, 1);
        } else {
            ((C109779e) this.f314798d).mo161038i(425, bArr, 1);
        }
        if (z) {
            if (v) {
                if (C110248b.zx0()) {
                    C105724z.INSTANCE.getClass();
                    C105714w.m141918c(JsApiQueryDownloadTask.CTRL_INDEX, bArr, 1);
                }
                if (C110248b.Jh0()) {
                    C105724z.INSTANCE.getClass();
                    C105714w.m141918c(JsApiInstallDownloadTask.CTRL_INDEX, bArr, 1);
                    return;
                }
                return;
            }
            if (C110248b.zx0()) {
                ((C109779e) this.f314798d).mo161038i(JsApiQueryDownloadTask.CTRL_INDEX, bArr, 1);
            }
            if (C110248b.Jh0()) {
                ((C109779e) this.f314798d).mo161038i(JsApiInstallDownloadTask.CTRL_INDEX, bArr, 1);
            }
        } else if (v) {
            C105724z zVar = C105724z.INSTANCE;
            zVar.getClass();
            C105714w.m141918c(JsApiQueryDownloadTask.CTRL_INDEX, bArr, 1);
            zVar.getClass();
            C105714w.m141918c(JsApiInstallDownloadTask.CTRL_INDEX, bArr, 1);
        } else {
            ((C109779e) this.f314798d).mo161038i(JsApiQueryDownloadTask.CTRL_INDEX, bArr, 1);
            ((C109779e) this.f314798d).mo161038i(JsApiInstallDownloadTask.CTRL_INDEX, bArr, 1);
        }
    }

    /* renamed from: f */
    public void mo150826f(boolean z) {
        byte[] bArr = new byte[1];
        boolean v = C105851w0.zx0().mo150680v();
        Log.printDebugStack("MicroMsg.MT.MultiTalkEngine", "setEngineMicOn, %s, isILinkMode, %s", Boolean.valueOf(z), Boolean.valueOf(v));
        if (z) {
            bArr[0] = 1;
            if (v) {
                C105724z.INSTANCE.getClass();
                C105714w.m141918c(413, bArr, 1);
                return;
            }
            ((C109779e) this.f314798d).mo161038i(413, bArr, 1);
            return;
        }
        bArr[0] = 0;
        if (v) {
            C105724z.INSTANCE.getClass();
            C105714w.m141918c(412, bArr, 1);
            return;
        }
        ((C109779e) this.f314798d).mo161038i(412, bArr, 1);
    }

    /* renamed from: g */
    public void mo150827g(boolean z) {
        byte[] bArr = new byte[1];
        boolean v = C105851w0.zx0().mo150680v();
        Log.printDebugStack("MicroMsg.MT.MultiTalkEngine", "qipengfeng, setEngineSpeakerOn, %s, isILinkMode, %s", Boolean.valueOf(z), Boolean.valueOf(v));
        if (z) {
            bArr[0] = 1;
            if (v) {
                C105724z.INSTANCE.getClass();
                C105714w.m141918c(401, bArr, 1);
                return;
            }
            ((C109779e) this.f314798d).mo161038i(401, bArr, 1);
            return;
        }
        bArr[0] = 0;
        if (v) {
            C105724z.INSTANCE.getClass();
            C105714w.m141918c(402, bArr, 1);
            return;
        }
        ((C109779e) this.f314798d).mo161038i(402, bArr, 1);
    }

    /* renamed from: h */
    public void mo150828h() {
        MTimerHandler mTimerHandler = this.f314807p;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f314807p.quitSafely();
            this.f314807p.removeCallbacksAndMessages((Object) null);
        }
        MTimerHandler mTimerHandler2 = new MTimerHandler(new C105850e(), true);
        this.f314807p = mTimerHandler2;
        mTimerHandler2.startTimer(33);
    }

    /* renamed from: i */
    public void mo150829i() {
        MTimerHandler mTimerHandler = this.f314807p;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f314807p.quitSafely();
            this.f314807p.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: j */
    public final void mo150830j() {
        int i;
        int i2;
        int i3;
        Class cls = C32735h.class;
        byte[] bArr = {0};
        byte[] bArr2 = new byte[2];
        int i4 = C107835h0.f322846c.f322706O;
        if (i4 > -1) {
            bArr2[0] = (byte) i4;
            ((C109779e) mo150823c()).mo161038i(406, bArr2, 1);
        } else if (i4 == -2) {
            ((C109779e) mo150823c()).mo161038i(407, bArr, 1);
        }
        VoipModelResMgr voipModelResMgr = VoipModelResMgr.f207454a;
        voipModelResMgr.mo98752d();
        StringBuilder sb = new StringBuilder(1024);
        voipModelResMgr.mo98750b(sb);
        Log.m105924i("MicroMsg.MT.MultiTalkEngine", "get ModelRoot: " + sb.toString());
        byte[] bytes = sb.toString().getBytes();
        ((C109779e) mo150823c()).mo161038i(938, bytes, sb.toString().length());
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_cldnn_ns, -1);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_cldnn_ns_ct, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, cldnn_ns_config:%d, cldnn_ns_ct:%d", Integer.valueOf(Qe), Integer.valueOf(Qe2));
        if (Qe > 0) {
            int i5 = Qe & 1;
            int i6 = (Qe >> 1) & 3;
            Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, cldnn ns para: %d, %d, %d", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(Qe2));
            ((C109779e) mo150823c()).mo161038i(470, new byte[]{(byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 24) & 255), (byte) (i6 & 255), (byte) ((i6 >> 8) & 255), (byte) ((i6 >> 16) & 255), (byte) ((i6 >> 24) & 255), (byte) (Qe2 & 255), (byte) ((Qe2 >> 8) & 255), (byte) ((Qe2 >> 16) & 255), (byte) ((Qe2 >> 24) & 255)}, 3);
        }
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_agc_params_ex, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, x_agc_paras = %d", Integer.valueOf(Qe3));
        if (Qe3 > 0) {
            byte b = (byte) (Qe3 & 1);
            Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, agc_switch = %d", Byte.valueOf(b));
            if (b > 0) {
                byte b2 = (byte) ((Qe3 >> 1) & 3);
                byte[] bArr3 = {b2, (byte) ((Qe3 >> 3) & 31), (byte) ((Qe3 >> 8) & 31), (byte) ((Qe3 >> 13) & 31), (byte) ((Qe3 >> 18) & 31), (byte) ((Qe3 >> 23) & 7), (byte) ((Qe3 >> 26) & 15), (byte) ((Qe3 >> 30) & 1)};
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, agc para: %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(b2), Byte.valueOf(bArr3[1]), Byte.valueOf(bArr3[2]), Byte.valueOf(bArr3[3]), Byte.valueOf(bArr3[4]), Byte.valueOf(bArr3[5]), Byte.valueOf(bArr3[6]), Byte.valueOf(bArr3[7]));
                i = 8;
                ((C109779e) mo150823c()).mo161038i(404, bArr3, 8);
            } else {
                i = 8;
                ((C109779e) mo150823c()).mo161038i(405, bArr, 1);
            }
        } else {
            i = 8;
        }
        C107823c cVar = C107835h0.f322846c;
        int i7 = cVar.f322716T;
        if (i7 > -1) {
            byte[] bArr4 = new byte[i];
            byte[] bArr5 = new byte[2];
            int i8 = cVar.f322718U;
            if (i8 > -1 && (i3 = cVar.f322720V) > -1) {
                bArr5[0] = (byte) i8;
                bArr5[1] = (byte) i3;
                if (cVar.f322722W > -1) {
                    bArr4[0] = (byte) i7;
                    byte b3 = (byte) i3;
                    bArr4[1] = b3;
                    bArr4[2] = b3;
                    bArr4[3] = b3;
                    bArr4[4] = (byte) i8;
                    bArr4[5] = (byte) cVar.f322738d0;
                    bArr4[6] = (byte) cVar.f322740e0;
                    bArr4[7] = (byte) cVar.f322724X;
                    ((C109779e) mo150823c()).mo161038i(404, bArr4, 8);
                } else {
                    ((C109779e) mo150823c()).mo161038i(404, bArr5, 2);
                }
            } else if (i8 > -1 && (i2 = cVar.f322726Y) > -1) {
                bArr4[0] = (byte) i7;
                bArr4[1] = (byte) i2;
                bArr4[2] = (byte) cVar.f322728Z;
                bArr4[3] = (byte) cVar.f322731a0;
                bArr4[4] = (byte) i8;
                bArr4[5] = (byte) cVar.f322738d0;
                bArr4[6] = (byte) cVar.f322740e0;
                bArr4[7] = (byte) cVar.f322724X;
                ((C109779e) mo150823c()).mo161038i(404, bArr4, 8);
            }
        } else if (i7 == -2) {
            ((C109779e) mo150823c()).mo161038i(405, bArr, 1);
        }
        int g = C112597j.m153942g("ladder_cpu");
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, nLadderCPU:%d", Integer.valueOf(g));
        if (g >= 0) {
            C105724z.INSTANCE.mo150610t(97, new byte[]{(byte) (g & 255), (byte) ((g >> 8) & 255), (byte) ((g >> 16) & 255), (byte) ((g >> 24) & 255)}, 1);
        }
        long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_mt_wave_agc, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, x-expt settings, wave_agc_paras: %d", Long.valueOf(He));
        if (He > -1) {
            byte[] bArr6 = new byte[11];
            byte b4 = (byte) ((int) (3 & He));
            bArr6[0] = b4;
            Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, x-expt settings, wave agc mode: %d", Byte.valueOf(b4));
            byte b5 = bArr6[0];
            if (b5 == 1) {
                bArr6[1] = (byte) ((int) ((He >> 2) & 31));
                bArr6[2] = (byte) ((int) ((He >> 7) & 31));
                bArr6[3] = (byte) ((int) ((He >> 12) & 31));
                bArr6[4] = (byte) ((int) ((He >> 17) & 31));
                bArr6[5] = (byte) ((int) ((He >> 22) & 15));
                bArr6[6] = (byte) ((int) ((He >> 26) & 15));
                bArr6[7] = (byte) ((int) ((He >> 30) & 1));
                bArr6[8] = (byte) ((int) ((He >> 31) & 31));
                bArr6[9] = (byte) ((int) ((He >> 36) & 31));
                bArr6[10] = (byte) ((int) ((He >> 41) & 31));
                ((C109779e) mo150823c()).mo161038i(461, bArr6, 11);
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, x-expt settings, wave agc paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr6[1]), Byte.valueOf(bArr6[2]), Byte.valueOf(bArr6[3]), Byte.valueOf(bArr6[4]), Byte.valueOf(bArr6[5]), Byte.valueOf(bArr6[6]), Byte.valueOf(bArr6[7]), Byte.valueOf(bArr6[8]), Byte.valueOf(bArr6[9]), Byte.valueOf(bArr6[10]));
            } else if (b5 == 2) {
                bArr6[1] = (byte) ((int) ((He >> 2) & 31));
                bArr6[2] = (byte) ((int) ((He >> 7) & 31));
                bArr6[3] = (byte) ((int) ((He >> 12) & 31));
                bArr6[4] = (byte) ((int) ((He >> 17) & 31));
                bArr6[5] = (byte) ((int) ((He >> 22) & 15));
                bArr6[6] = (byte) ((int) ((He >> 26) & 15));
                ((C109779e) mo150823c()).mo161038i(461, bArr6, 7);
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, x-expt settings, wave agc paras: %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr6[1]), Byte.valueOf(bArr6[2]), Byte.valueOf(bArr6[3]), Byte.valueOf(bArr6[4]), Byte.valueOf(bArr6[5]), Byte.valueOf(bArr6[6]));
            } else if (b5 == 0) {
                ((C109779e) mo150823c()).mo161038i(462, bArr6, 1);
            }
        }
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, device-model config, SrvDeviceInfo.mAudioInfo.waveAgcMode: %d", Integer.valueOf(C107835h0.f322846c.f322742f0));
        C107823c cVar2 = C107835h0.f322846c;
        int i9 = cVar2.f322742f0;
        if (i9 > -1) {
            byte[] bArr7 = new byte[11];
            byte b6 = (byte) i9;
            bArr7[0] = b6;
            if (b6 == 1) {
                bArr7[1] = (byte) cVar2.f322756m0;
                bArr7[2] = (byte) cVar2.f322758n0;
                bArr7[3] = (byte) cVar2.f322760o0;
                bArr7[4] = (byte) cVar2.f322750j0;
                bArr7[5] = (byte) cVar2.f322752k0;
                bArr7[6] = (byte) cVar2.f322754l0;
                bArr7[7] = (byte) cVar2.f322762p0;
                bArr7[8] = (byte) cVar2.f322744g0;
                bArr7[9] = (byte) cVar2.f322746h0;
                bArr7[10] = (byte) cVar2.f322748i0;
                ((C109779e) mo150823c()).mo161038i(461, bArr7, 11);
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, device-model config, wave agc paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr7[1]), Byte.valueOf(bArr7[2]), Byte.valueOf(bArr7[3]), Byte.valueOf(bArr7[4]), Byte.valueOf(bArr7[5]), Byte.valueOf(bArr7[6]), Byte.valueOf(bArr7[7]), Byte.valueOf(bArr7[8]), Byte.valueOf(bArr7[9]), Byte.valueOf(bArr7[10]));
            } else if (b6 == 2) {
                bArr7[1] = (byte) cVar2.f322744g0;
                bArr7[2] = (byte) cVar2.f322746h0;
                bArr7[3] = (byte) cVar2.f322748i0;
                bArr7[4] = (byte) cVar2.f322750j0;
                bArr7[5] = (byte) cVar2.f322752k0;
                bArr7[6] = (byte) cVar2.f322754l0;
                ((C109779e) mo150823c()).mo161038i(461, bArr7, 7);
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, device-model config, wave agc paras: %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr7[1]), Byte.valueOf(bArr7[2]), Byte.valueOf(bArr7[3]), Byte.valueOf(bArr7[4]), Byte.valueOf(bArr7[5]), Byte.valueOf(bArr7[6]));
            } else if (b6 == 0) {
                ((C109779e) mo150823c()).mo161038i(462, bArr7, 1);
            }
        }
        int i15 = C107835h0.f322846c.f322710Q;
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "kerrizhang SrvDeviceInfo.mAudioInfo.nsModeNewMulti %d", Integer.valueOf(i15));
        int i16 = C107835h0.f322846c.f322710Q;
        if (i16 > -1) {
            if (i15 > 0) {
                int floor = ((int) Math.floor(((double) i15) / 1000.0d)) % 100;
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "kerrizhang SrvDeviceInfo.mAudioInfo.iflag %d", Integer.valueOf(floor));
                if (floor > 0) {
                    ((C109779e) mo150823c()).mo161038i(408, new byte[]{(byte) (i15 & 255), (byte) ((i15 >> 8) & 255), (byte) ((i15 >> 16) & 255), (byte) ((i15 >> 24) & 255)}, 4);
                }
            } else if (i15 == 0) {
                bArr[0] = (byte) (i15 & 255);
                ((C109779e) mo150823c()).mo161038i(409, bArr, 1);
            }
        } else if (i16 == -2) {
            bArr[0] = (byte) (i15 & 255);
            ((C109779e) mo150823c()).mo161038i(409, bArr, 1);
        }
        int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voipmt_rnnoise_sinfreqwind, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "mevinwang, voipmt nssinfwindmode = %d", Integer.valueOf(Qe4));
        if (Qe4 > 0) {
            ((C109779e) mo150823c()).mo161038i(408, new byte[]{(byte) (Qe4 & 255), (byte) ((Qe4 >> 8) & 255), (byte) ((Qe4 >> 16) & 255), (byte) ((Qe4 >> 24) & 255)}, 4);
        } else if (Qe4 == 0) {
            ((C109779e) mo150823c()).mo161038i(409, new byte[]{(byte) (Qe4 & 255)}, 1);
        }
        short[] sArr = C107835h0.f322846c.f322772u0;
        short s = sArr[0];
        if (s > 0 || sArr[1] > 0) {
            bArr2[0] = 0;
            bArr2[1] = 0;
            if (s > 0 && s < 10000) {
                bArr2[0] = (byte) s;
            }
            short s2 = sArr[1];
            if (s2 > 0 && s2 < 10000) {
                bArr2[1] = (byte) s2;
            }
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodSetNgStrength, bArr2, 2);
        }
        C107823c cVar3 = C107835h0.f322846c;
        int i17 = cVar3.f322757n;
        if (i17 > -1 || cVar3.f322761p > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i17 > -1) {
                bArr2[0] = (byte) i17;
            }
            int i18 = cVar3.f322761p;
            if (i18 > -1) {
                bArr2[1] = (byte) i18;
            }
            ((C109779e) mo150823c()).mo161038i(414, bArr2, 2);
        }
        C107823c cVar4 = C107835h0.f322846c;
        int i19 = cVar4.f322759o;
        if (i19 > -1 || cVar4.f322763q > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i19 > -1) {
                bArr2[0] = (byte) i19;
            }
            int i25 = cVar4.f322763q;
            if (i25 > -1) {
                bArr2[1] = (byte) i25;
            }
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodOutputVolumeScaleEnable, bArr2, 2);
        }
        C107823c cVar5 = C107835h0.f322846c;
        int i26 = cVar5.f322765r;
        if (i26 > -1 || cVar5.f322767s > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i26 > -1) {
                bArr2[0] = (byte) i26;
            }
            int i27 = cVar5.f322767s;
            if (i27 > -1) {
                bArr2[1] = (byte) i27;
            }
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodOutputVolumeGainEnable, bArr2, 2);
        }
        int i28 = C107835h0.f322846c.f322777x;
        if (i28 > -1) {
            bArr2[0] = (byte) i28;
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodEhanceHeadsetEC, bArr2, 1);
        }
        int i29 = C107835h0.f322846c.f322779y;
        if (i29 > -1 && i29 != 5) {
            bArr2[0] = (byte) i29;
            ((C109779e) mo150823c()).mo161038i(417, bArr2, 1);
        }
        int i35 = C107835h0.f322846c.f322781z;
        if (i35 > -1 && i35 != 5) {
            bArr2[0] = (byte) i35;
            ((C109779e) mo150823c()).mo161038i(418, bArr2, 1);
        }
        int i36 = C107835h0.f322846c.f322678A;
        if (i36 > -1) {
            bArr2[0] = (byte) i36;
            ((C109779e) mo150823c()).mo161038i(419, bArr2, 1);
        }
        if (1 == C107835h0.f322846c.f322768s0) {
            byte[] bArr8 = new byte[30];
            for (int i37 = 0; i37 < 15; i37++) {
                int i38 = i37 * 2;
                short s3 = C107835h0.f322846c.f322770t0[i37];
                bArr8[i38] = (byte) (s3 & 255);
                bArr8[i38 + 1] = (byte) ((s3 >> 8) & 255);
            }
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodSetPlayerPreCorrectCofOn, bArr8, 30);
        }
        if (C107835h0.f322846c.f322768s0 == 0) {
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodSetPlayerPreCorrectCofOff, bArr, 1);
        }
        int i39 = C107835h0.f322846c.f322774v0;
        if (i39 > 0) {
            bArr2[0] = (byte) i39;
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodSetSpkEnhance, bArr2, 1);
        }
        int i44 = C107835h0.f322846c.f322680B;
        if (i44 > 0) {
            bArr2[0] = (byte) i44;
            ((C109779e) mo150823c()).mo161038i(431, bArr2, 4);
        }
        int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_agcrx_params, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, x_agcrx_paras: %d", Integer.valueOf(Qe5));
        if (Qe5 > 0) {
            byte b7 = (byte) (Qe5 & 1);
            Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, agcrx_switch: %d", Byte.valueOf(b7));
            if (b7 > 0) {
                byte[] bArr9 = {(byte) ((Qe5 >> 1) & 3), (byte) ((Qe5 >> 3) & 31), (byte) ((Qe5 >> 8) & 31), (byte) ((Qe5 >> 13) & 1)};
                ((C109779e) mo150823c()).mo161038i(v2helper.EMethodSetAgcRxOn, bArr9, 4);
                Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, agc rx para: %d, %d, %d, %d", Byte.valueOf(bArr9[0]), Byte.valueOf(bArr9[1]), Byte.valueOf(bArr9[2]), Byte.valueOf(bArr9[3]));
            }
        }
        C107823c cVar6 = C107835h0.f322846c;
        int i45 = cVar6.f322685D0;
        if (i45 > -1) {
            ((C109779e) mo150823c()).mo161038i(v2helper.EMethodSetAgcRxOn, new byte[]{(byte) i45, (byte) cVar6.f322687E0, (byte) cVar6.f322689F0, (byte) cVar6.f322691G0}, 4);
        }
        int Qe6 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_play_fadeinfadeout_switch, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "kerrizhang, multi_play_fadeinfadeout_switch = %d", Integer.valueOf(Qe6));
        byte[] bArr10 = {0};
        if (Qe6 > 0) {
            bArr10[0] = (byte) Qe6;
        }
        ((C109779e) mo150823c()).mo161038i(451, bArr10, 1);
        int Qe7 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_multi_play_fadeinfadeout_thresh, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "kerrizhang, multi_play_fadeinfadeout_thresh = %d", Integer.valueOf(Qe7));
        bArr10[0] = 0;
        if (Qe7 > 0) {
            bArr10[0] = (byte) Qe7;
        }
        ((C109779e) mo150823c()).mo161038i(452, bArr10, 1);
        long[] jArr = {((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_activerangecnt, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange1, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange2, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange3, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange4, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange5, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange6, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange7, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange8, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange9, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange10, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange11, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange12, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange13, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange14, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange15, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange16, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange17, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange18, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange19, -1), ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_multi_lossrange20, -1)};
        ByteBuffer order = ByteBuffer.allocate(168).order(ByteOrder.LITTLE_ENDIAN);
        order.asLongBuffer().put(jArr);
        byte[] array = order.array();
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "kerrizhang, multi_loss_control[0] %d,multi_loss_control[1] %d multi_loss_control[2] %d", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]), Long.valueOf(jArr[2]));
        ((C109779e) mo150823c()).mo161038i(453, array, array.length);
        int Qe8 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_rcnnvadctr, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "kerrizhang, rcnnvad_switch = %d", Integer.valueOf(Qe8));
        if (Qe8 > 0) {
            ((C109779e) mo150823c()).mo161038i(C86940g0.CTRL_INDEX, new byte[]{(byte) Qe8}, 1);
        }
        int Qe9 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_aec_value, 0);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "dennyliang, voip aec_value = %d", Integer.valueOf(Qe9));
        if (Qe9 > 0) {
            ((C109779e) mo150823c()).mo161038i(460, new byte[]{(byte) (Qe9 & 255), (byte) ((Qe9 >> 8) & 255), (byte) ((Qe9 >> 16) & 255), (byte) ((Qe9 >> 24) & 255)}, 4);
        }
        int Qe10 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_howlsup_value, 0);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "dennyliang, voip howlsup_value = %d", Integer.valueOf(Qe10));
        if (Qe10 > 0) {
            ((C109779e) mo150823c()).mo161038i(JsApiAddDownloadTask.CTRL_INDEX, new byte[]{(byte) (Qe10 & 255), (byte) ((Qe10 >> 8) & 255), (byte) ((Qe10 >> 16) & 255), (byte) ((Qe10 >> 24) & 255)}, 4);
        }
        int Qe11 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_frz_sta_peroid, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, updateAudioAdaption, frz_sta_p_x = %d", Integer.valueOf(Qe11));
        if (Qe11 > 0) {
            ((C109779e) mo150823c()).mo161038i(C82993v.CTRL_INDEX, new byte[]{(byte) (Qe11 & 255), (byte) ((Qe11 >> 8) & 255), (byte) ((Qe11 >> 16) & 255), (byte) ((Qe11 >> 24) & 255)}, 4);
        }
        int Qe12 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_new_net_state_tips, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, updateAudioAdaption, net_state_xexpt = %d", Integer.valueOf(Qe12));
        byte[] bArr11 = {0};
        if (Qe12 == 1) {
            bArr11[0] = 1;
        }
        ((C109779e) mo150823c()).mo161038i(C90846d.CTRL_INDEX, bArr11, 1);
        int Qe13 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt_play_volume_factor, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, updateAudioAdaption, play_vol = %d", Integer.valueOf(Qe13));
        byte[] bArr12 = {0};
        if (Qe13 > 0 && Qe13 < 20) {
            bArr12[0] = (byte) Qe13;
            ((C109779e) mo150823c()).mo161038i(C89699b.C89702c.CTRL_INDEX, bArr12, 1);
        }
        int i46 = C107835h0.f322846c.f322736c0;
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, rvDeviceInfo.mAudioInfo.playVolMT: %d", Integer.valueOf(i46));
        if (i46 > 0 && i46 < 20) {
            bArr12[0] = (byte) i46;
            ((C109779e) mo150823c()).mo161038i(C89699b.C89702c.CTRL_INDEX, bArr12, 1);
        }
        int Qe14 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_engine_get_data_config, -1);
        Log.m105925i("MicroMsg.MT.MultiTalkEngine", "qipengfeng, updateAudioAdaption, switch_flag_x = %d", Integer.valueOf(Qe14));
        byte[] bArr13 = {0};
        if (Qe14 > 0) {
            bArr13[0] = 1;
        }
        ((C109779e) mo150823c()).mo161038i(450, bArr13, 1);
        int Qe15 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_mt3d_flag, -1);
        int i47 = C107835h0.f322846c.f322693H0;
        Log.m105919d("MicroMsg.MT.MultiTalkEngine", "MT3D, updateAudioAdaption, mt3d_flag_x = %d", Integer.valueOf(Qe15));
        Log.m105919d("MicroMsg.MT.MultiTalkEngine", "MT3D, updateAudioAdaption, mt3d_flag_s = %d", Integer.valueOf(i47));
        byte[] bArr14 = {0};
        if (Qe15 > 0 && i47 > 0) {
            bArr14[0] = 1;
            mo150822b();
        }
        ((C109779e) mo150823c()).mo161038i(446, bArr14, 1);
        C105823o oVar = this.f314799e;
        if (oVar != null) {
            byte[] bArr15 = new byte[1];
            if (2 == oVar.mo150806a()) {
                bArr15[0] = 1;
                ((C109779e) mo150823c()).mo161038i(FileUtils.S_IRWXU, bArr15, 1);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C103909x xVar;
        String str2;
        C103907w wVar;
        int i3 = i2;
        C42575l0 l0Var = (C42575l0) yVar;
        Log.m105924i("MicroMsg.MT.MultiTalkEngine", "onSceneEnd errtype " + i + " errCode " + i3 + " cmdid " + l0Var.f115190g);
        C107064d dVar = this.f314798d;
        int i4 = l0Var.f115189f;
        int i5 = l0Var.f115190g;
        byte[] bArr = l0Var.f115191h;
        ((C109779e) dVar).getClass();
        Object[] objArr = new Object[8];
        objArr[0] = "handleMultiTalkResp retCode: ";
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = " seq: ";
        objArr[3] = Integer.valueOf(i4);
        objArr[4] = " cmdId: ";
        objArr[5] = Integer.valueOf(i5);
        objArr[6] = " data length: ";
        objArr[7] = Integer.valueOf(bArr == null ? 0 : bArr.length);
        C104161b.m138997f("TalkRoomSdkApi", objArr);
        if (i3 == 0) {
            C112679g e = C112679g.m154059e();
            C112679g.C112681b c = e.mo164415c(i4);
            if (c != null || -1000 == i4) {
                try {
                    xVar = new C103909x();
                    C108421e.m146905c(xVar, bArr);
                } catch (Exception e2) {
                    C104161b.m138997f("NETCMD", "Exception genReadPackageData" + e2.getMessage());
                    xVar = null;
                }
                if (xVar == null || (wVar = xVar.f307213b) == null) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = " pack.head: ";
                    if (xVar == null) {
                        str2 = " pack is null ";
                    } else {
                        str2 = " head is " + xVar.f307213b;
                    }
                    objArr2[1] = str2;
                    C104161b.m138997f("NETCMD", objArr2);
                    e.mo164417f(c, i4, -3, (byte[]) null);
                    return;
                }
                int i6 = wVar.f307208e;
                int i7 = wVar.f307209f;
                String str3 = wVar.f307205b;
                if (i6 != 0 && c != null) {
                    C104161b.m138997f("NETCMD", "CLTRCV", Integer.valueOf(i4), c.f337396b, Integer.valueOf(i6), str3, Integer.valueOf(i7));
                } else if (c != null) {
                    C104161b.m138993b("NETCMD", "CLTRCV", Integer.valueOf(i4), c.f337396b, Integer.valueOf(i6), str3, Integer.valueOf(i7));
                }
                byte[] bArr2 = xVar.f307214c;
                if (bArr2 != null) {
                    e.mo164417f(c, i4, i6, bArr2);
                } else {
                    e.mo164417f(c, i4, i6, (byte[]) null);
                }
            } else {
                C104161b.m138997f("NETCMD", "buf2Resp fail: taskId:" + i4 + " not found");
                C104164e.m138998a(20007, 3, String.valueOf(-1202));
            }
        } else {
            C112679g e3 = C112679g.m154059e();
            C112679g.C112681b c2 = e3.mo164415c(i4);
            if (c2 != null) {
                C104161b.m138997f("NETCMD", "CLTRCV FAIL", Integer.valueOf(i4), c2.f337396b, 1, Integer.valueOf(i2));
                e3.mo164417f(c2, i4, -1, (byte[]) null);
            }
        }
    }
}
