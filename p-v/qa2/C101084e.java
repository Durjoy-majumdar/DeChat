package qa2;

import android.text.TextUtils;
import com.pay.tool.APPluginConstants;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.util.WXWebReporter;
import ha2.C32752h;
import ja2.C98927b;
import java.util.ArrayList;
import la2.C99357e;
import la2.C99364n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import qc0.C101106m;
import qc0.C47800k;
import te3.C50067k13;
import te3.C50445ms3;
import te3.C50588ns3;

/* renamed from: qa2.e */
public class C101084e implements C99357e {

    /* renamed from: a */
    public final C101086f f295913a = new C101086f();

    /* renamed from: b */
    public final C101082c f295914b = new C101082c();

    /* renamed from: c */
    public final C101080a f295915c = new C101080a();

    /* renamed from: d */
    public C47800k f295916d = null;

    /* renamed from: qa2.e$a */
    public class C101085a implements l0$$e {
        public C101085a(C101084e eVar) {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105925i("MicroMsg.Music.MusicWechatReportService", "reportMusicInfo callback errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            return 0;
        }
    }

    /* renamed from: A0 */
    public void mo138797A0(C98927b bVar) {
        this.f295914b.f295907j = bVar;
    }

    /* renamed from: B */
    public void mo138798B(C101106m mVar, int i) {
        this.f295913a.getClass();
        IDKey iDKey = new IDKey();
        iDKey.SetID(JsApiSetLabInfo.CTRL_INDEX);
        iDKey.SetKey(i == 2 ? 92 : i == 3 ? 93 : i == 4 ? 94 : i == 5 ? 95 : i == 6 ? 96 : i == 7 ? 97 : i == 8 ? 98 : i == 9 ? 99 : 100);
        iDKey.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160124a(arrayList, true);
        String c = C32752h.m39804c(mVar.f295955Q);
        Log.m105925i("MicroMsg.Music.QQMusicPlayerReportImpl", "mineTypeStr:%s", c);
        if (!TextUtils.isEmpty(c)) {
            nVar.mo160131h(14486, 1, Integer.valueOf(mVar.f295959d), Integer.valueOf(C101081b.m132448a(c)), c);
        } else {
            Log.m105920e("MicroMsg.Music.QQMusicPlayerReportImpl", "music is null or mineTypeStr is empty");
        }
    }

    /* renamed from: S */
    public void mo138799S(C101106m mVar, int i, int i2) {
        int i3;
        int i4;
        this.f295915c.getClass();
        IDKey iDKey = new IDKey();
        iDKey.SetID(797);
        iDKey.SetKey(2);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(797);
        int i5 = mVar.f295959d;
        Log.m105924i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerErrIdKeyByMusicType, musicType:" + i5);
        int i6 = 4;
        if (i5 == 0) {
            i3 = 62;
        } else if (i5 == 1) {
            i3 = 63;
        } else if (i5 != 4) {
            switch (i5) {
                case 6:
                    i3 = 65;
                    break;
                case 7:
                    i3 = 66;
                    break;
                case 8:
                    i3 = 67;
                    break;
                case 9:
                    i3 = 68;
                    break;
                case 10:
                    i3 = 69;
                    break;
                case 11:
                    i3 = 70;
                    break;
                default:
                    i3 = 71;
                    break;
            }
        } else {
            i3 = 64;
        }
        iDKey2.SetKey(i3);
        iDKey2.SetValue(1);
        IDKey iDKey3 = new IDKey();
        iDKey3.SetID(797);
        Log.m105924i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerErrTypeIdKey, errType:" + i);
        switch (i) {
            case -4005:
                i6 = 8;
                break;
            case -4004:
                i6 = 7;
                break;
            case -4003:
                i6 = 6;
                break;
            case -4002:
                i6 = 5;
                break;
            case -4001:
                break;
            case -4000:
                i6 = 3;
                break;
            default:
                i6 = 9;
                break;
        }
        iDKey3.SetKey(i6);
        iDKey3.SetValue(1);
        IDKey iDKey4 = new IDKey();
        iDKey4.SetID(797);
        Log.m105924i("MicroMsg.Music.ExoPlayIdkeyReport", "getExoMusicPlayerErrIdKey, errCode:" + i2);
        if (i2 == -30) {
            i4 = 21;
        } else if (i2 == -3) {
            i4 = 16;
        } else if (i2 != -2) {
            switch (i2) {
                case APPluginConstants.ERROR_IO_SSLException_SSLPeerUnverifiedException:
                    i4 = 25;
                    break;
                case APPluginConstants.ERROR_IO_SSLException_SSLKeyException:
                    i4 = 24;
                    break;
                case APPluginConstants.ERROR_IO_SSLException_SSLHandshakeException:
                    i4 = 23;
                    break;
                case APPluginConstants.ERROR_IO_ProtocolException:
                    i4 = 22;
                    break;
                default:
                    switch (i2) {
                        case -13:
                            i4 = 20;
                            break;
                        case -12:
                            i4 = 19;
                            break;
                        case -11:
                            i4 = 18;
                            break;
                        case -10:
                            i4 = 17;
                            break;
                        default:
                            i4 = 14;
                            break;
                    }
            }
        } else {
            i4 = 15;
        }
        iDKey4.SetKey(i4);
        iDKey4.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        arrayList.add(iDKey3);
        arrayList.add(iDKey4);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: c0 */
    public void mo138800c0() {
        C101082c cVar = this.f295914b;
        cVar.getClass();
        Log.m105924i("MicroMsg.Music.MusicPlayerReportImpl", "initIdKeyStatDataForMusicPlayer");
        cVar.f295898a = false;
        cVar.f295899b = false;
        cVar.f295900c = false;
        cVar.f295901d = false;
        cVar.f295902e = false;
        cVar.f295903f = false;
        cVar.f295904g = false;
        cVar.f295905h = false;
        cVar.f295906i = false;
    }

    /* renamed from: d0 */
    public void mo138801d0(C101106m mVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        C101106m mVar2 = mVar;
        int i15 = i;
        C101082c cVar = this.f295914b;
        cVar.getClass();
        IDKey iDKey = new IDKey();
        iDKey.SetID(JsApiSetLabInfo.CTRL_INDEX);
        iDKey.SetKey(3);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(JsApiSetLabInfo.CTRL_INDEX);
        int i16 = mVar2.f295959d;
        Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerErrIdKeyByMusicType, musicType:" + i16);
        if (i16 == 0) {
            i3 = 60;
        } else if (i16 != 1) {
            switch (i16) {
                case 4:
                    i3 = 62;
                    break;
                case 5:
                    i3 = 63;
                    break;
                case 6:
                    i3 = 64;
                    break;
                case 7:
                    i3 = 5;
                    break;
                case 8:
                    i3 = 65;
                    break;
                case 9:
                    i3 = 66;
                    break;
                default:
                    i3 = 6;
                    break;
            }
        } else {
            i3 = 61;
        }
        iDKey2.SetKey(i3);
        iDKey2.SetValue(1);
        IDKey iDKey3 = new IDKey();
        iDKey3.SetID(JsApiSetLabInfo.CTRL_INDEX);
        if (i15 == -1) {
            iDKey3.SetKey(12);
        } else if (i15 == 6) {
            iDKey3.SetKey(46);
        } else if (i15 == -2) {
            iDKey3.SetKey(13);
        } else if (i15 == 5) {
            iDKey3.SetKey(16);
        } else if (i15 == 4) {
            iDKey3.SetKey(14);
        } else if (i15 == 20) {
            iDKey3.SetKey(11);
        } else if (i15 == 21) {
            iDKey3.SetKey(47);
        } else if (i15 == 19) {
            iDKey3.SetKey(190);
        }
        iDKey3.SetValue(1);
        ArrayList arrayList = new ArrayList();
        IDKey iDKey4 = new IDKey();
        iDKey4.SetID(JsApiSetLabInfo.CTRL_INDEX);
        iDKey4.SetValue(1);
        if (i15 != 19 && (cVar.mo140534a() == null || !cVar.mo140534a().contains("text/html"))) {
            if (i15 == 21) {
                int i17 = mVar2.f295959d;
                Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerPlayErrIdKeyByMusicType, musicType:" + i17);
                if (i17 == 0) {
                    i9 = 159;
                } else if (i17 == 1) {
                    i9 = 160;
                } else if (i17 != 4) {
                    switch (i17) {
                        case 6:
                            i9 = 162;
                            break;
                        case 7:
                            i9 = 163;
                            break;
                        case 8:
                            i9 = 164;
                            break;
                        case 9:
                            i9 = 165;
                            break;
                        default:
                            i9 = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED;
                            break;
                    }
                } else {
                    i9 = 161;
                }
                iDKey4.SetKey(i9);
                arrayList.add(iDKey4);
            } else if (i15 == -1 || i15 == 6 || i15 == -2 || i15 == 5 || i15 == 4) {
                int i18 = mVar2.f295959d;
                Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerNetworkErrIdKeyByMusicType, musicType:" + i18);
                if (i18 == 0) {
                    i8 = 151;
                } else if (i18 == 1) {
                    i8 = 152;
                } else if (i18 != 4) {
                    switch (i18) {
                        case 6:
                            i8 = 154;
                            break;
                        case 7:
                            i8 = 155;
                            break;
                        case 8:
                            i8 = 156;
                            break;
                        case 9:
                            i8 = 157;
                            break;
                        default:
                            i8 = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED;
                            break;
                    }
                } else {
                    i8 = 153;
                }
                iDKey4.SetKey(i8);
                arrayList.add(iDKey4);
            }
        }
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        arrayList.add(iDKey3);
        Log.m105925i("MicroMsg.Music.MusicPlayerReportImpl", "hasStatForHttpErr:%b, hasStatForUrlErr:%b, hasStatForNetworkErr:%b, hasStatForHttpRangeErr:%b, hasStatDownloadExceptionErr:%b", Boolean.valueOf(cVar.f295898a), Boolean.valueOf(cVar.f295900c), Boolean.valueOf(cVar.f295903f), Boolean.valueOf(cVar.f295899b), Boolean.valueOf(cVar.f295901d));
        if (i15 == -1 && !cVar.f295898a) {
            cVar.f295898a = true;
            C98927b bVar = cVar.f295907j;
            int i19 = bVar != null ? bVar.f289997o : 0;
            if (i19 == 403) {
                IDKey iDKey5 = new IDKey();
                iDKey5.SetID(JsApiSetLabInfo.CTRL_INDEX);
                iDKey5.SetValue(1);
                iDKey5.SetKey(C101081b.m132449b(700));
                arrayList.add(iDKey5);
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160124a(arrayList, true);
            nVar.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 1, Integer.valueOf(i), Integer.valueOf(i19), 0);
        }
        if (i15 == 6 && !cVar.f295899b) {
            cVar.f295899b = true;
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160124a(arrayList, true);
            nVar2.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 1, Integer.valueOf(i), 0, 0);
        }
        if (i15 != -2 || cVar.f295900c) {
            i4 = 5;
        } else {
            cVar.f295900c = true;
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.mo160124a(arrayList, true);
            i4 = 5;
            nVar3.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 1, Integer.valueOf(i), 0, 0);
        }
        if (i15 == i4 && !cVar.f295901d) {
            cVar.f295901d = true;
            C115669n nVar4 = C115669n.INSTANCE;
            nVar4.mo160124a(arrayList, true);
            C98927b bVar2 = cVar.f295907j;
            nVar4.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 1, Integer.valueOf(i), 0, Integer.valueOf(bVar2 != null ? bVar2.f289998p : 0));
        }
        if (i15 != 19 || cVar.f295902e) {
            i5 = 4;
        } else {
            cVar.f295902e = true;
            C115669n nVar5 = C115669n.INSTANCE;
            nVar5.mo160124a(arrayList, true);
            i5 = 4;
            nVar5.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 1, Integer.valueOf(i), 0, 0);
        }
        if (i15 == i5 && !cVar.f295903f) {
            cVar.f295903f = true;
            C115669n nVar6 = C115669n.INSTANCE;
            nVar6.mo160124a(arrayList, true);
            nVar6.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 1, Integer.valueOf(i), 0, 0);
        }
        if (i15 != 20 || cVar.f295904g) {
            z = true;
        } else {
            z = true;
            cVar.f295904g = true;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(iDKey3);
            C115669n.INSTANCE.mo160124a(arrayList2, true);
        }
        if (i15 == 21 && !cVar.f295905h && cVar.f295904g) {
            cVar.f295905h = z;
            if (cVar.mo140534a() == null || !cVar.mo140534a().contains("text/html")) {
                IDKey iDKey6 = new IDKey();
                iDKey6.SetID(JsApiSetLabInfo.CTRL_INDEX);
                iDKey6.SetValue(1);
                iDKey6.SetKey(C101081b.m132449b(i2));
                arrayList.add(iDKey6);
                switch (i2) {
                    case 704:
                    case 705:
                    case 706:
                        z2 = true;
                        break;
                    default:
                        z2 = false;
                        break;
                }
                if (z2) {
                    IDKey iDKey7 = new IDKey();
                    iDKey7.SetID(JsApiSetLabInfo.CTRL_INDEX);
                    iDKey7.SetValue(1);
                    int i25 = mVar2.f295959d;
                    Log.m105924i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerDecodeErrIdKeyByMusicType, musicType:" + i25);
                    if (i25 == 0) {
                        i7 = 194;
                    } else if (i25 == 1) {
                        i7 = 195;
                    } else if (i25 != 4) {
                        switch (i25) {
                            case 6:
                                i7 = WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA;
                                break;
                            case 7:
                                i7 = 198;
                                break;
                            case 8:
                                i7 = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
                                break;
                            case 9:
                                i7 = 200;
                                break;
                            default:
                                i7 = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED;
                                break;
                        }
                    } else {
                        i7 = 196;
                    }
                    iDKey7.SetKey(i7);
                    arrayList.add(iDKey7);
                }
                i6 = i2;
            } else {
                i6 = 701;
                IDKey iDKey8 = new IDKey();
                iDKey8.SetID(JsApiSetLabInfo.CTRL_INDEX);
                iDKey8.SetValue(1);
                iDKey8.SetKey(C101081b.m132449b(701));
                arrayList.add(iDKey8);
            }
            C115669n nVar7 = C115669n.INSTANCE;
            nVar7.mo160124a(arrayList, true);
            nVar7.mo160131h(14777, 0, Integer.valueOf(mVar2.f295959d), 0, Integer.valueOf(i), Integer.valueOf(i6), 0);
        }
    }

    /* renamed from: e0 */
    public void mo138802e0(int i) {
        this.f295914b.getClass();
        if (i == 300 || i == 301 || i == 302 || i == 303) {
            IDKey iDKey = new IDKey();
            iDKey.SetID(JsApiSetLabInfo.CTRL_INDEX);
            iDKey.SetKey(15);
            iDKey.SetValue(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDKey);
            C115669n.INSTANCE.mo160124a(arrayList, true);
        }
    }

    /* renamed from: g */
    public void mo138803g(C101106m mVar, long j, long j2, long j3) {
        if (mVar != null) {
            Log.m105925i("MicroMsg.Music.MusicWechatReportService", "scene:%d, endPosition:%d, totalPlayTime:%d, duration:%d", Integer.valueOf(mVar.f295959d), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
            if (mVar.f295959d == 10) {
                mo140535w(mVar, j, j2, j3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138804g0(qc0.C101106m r18, int r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            r2 = r19
            qa2.f r3 = r1.f295913a
            r3.getClass()
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r4 = 558(0x22e, float:7.82E-43)
            r3.SetID(r4)
            r5 = 4
            r3.SetKey(r5)
            r6 = 1
            r3.SetValue(r6)
            com.tencent.mars.smc.IDKey r8 = new com.tencent.mars.smc.IDKey
            r8.<init>()
            r8.SetID(r4)
            int r9 = r0.f295959d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getQQMusicPlayerErrIdKeyByMusicType, musicType:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.Music.MusicPlayIdKeyReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            r10 = 1
            if (r9 == 0) goto L_0x0063
            if (r9 == r10) goto L_0x0060
            switch(r9) {
                case 4: goto L_0x005d;
                case 5: goto L_0x005a;
                case 6: goto L_0x0057;
                case 7: goto L_0x0054;
                case 8: goto L_0x0051;
                case 9: goto L_0x004e;
                case 10: goto L_0x004c;
                case 11: goto L_0x0049;
                default: goto L_0x0046;
            }
        L_0x0046:
            r9 = 9
            goto L_0x0065
        L_0x0049:
            r9 = 8
            goto L_0x0065
        L_0x004c:
            r9 = 7
            goto L_0x0065
        L_0x004e:
            r9 = 56
            goto L_0x0065
        L_0x0051:
            r9 = 55
            goto L_0x0065
        L_0x0054:
            r9 = 54
            goto L_0x0065
        L_0x0057:
            r9 = 53
            goto L_0x0065
        L_0x005a:
            r9 = 52
            goto L_0x0065
        L_0x005d:
            r9 = 51
            goto L_0x0065
        L_0x0060:
            r9 = 50
            goto L_0x0065
        L_0x0063:
            r9 = 49
        L_0x0065:
            r8.SetKey(r9)
            r8.SetValue(r6)
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r9.<init>()
            r9.SetID(r4)
            int r12 = qa2.C101081b.m132450c(r19)
            r9.SetKey(r12)
            r9.SetValue(r6)
            com.tencent.mars.smc.IDKey r12 = new com.tencent.mars.smc.IDKey
            r12.<init>()
            r12.SetID(r4)
            r12.SetValue(r6)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r14 = 80
            r16 = 0
            if (r2 != r14) goto L_0x0145
            int r14 = r0.f295959d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "getQQMusicPlayerNetworkErrIdKeyByMusicType, musicType:"
            r15.append(r6)
            r15.append(r14)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            if (r14 == 0) goto L_0x00cd
            if (r14 == r10) goto L_0x00ca
            if (r14 == r5) goto L_0x00c7
            switch(r14) {
                case 6: goto L_0x00c4;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00be;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00b8;
                case 11: goto L_0x00b5;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            r15 = 188(0xbc, float:2.63E-43)
            goto L_0x00cf
        L_0x00b5:
            r15 = 175(0xaf, float:2.45E-43)
            goto L_0x00cf
        L_0x00b8:
            r15 = 174(0xae, float:2.44E-43)
            goto L_0x00cf
        L_0x00bb:
            r15 = 173(0xad, float:2.42E-43)
            goto L_0x00cf
        L_0x00be:
            r15 = 172(0xac, float:2.41E-43)
            goto L_0x00cf
        L_0x00c1:
            r15 = 171(0xab, float:2.4E-43)
            goto L_0x00cf
        L_0x00c4:
            r15 = 170(0xaa, float:2.38E-43)
            goto L_0x00cf
        L_0x00c7:
            r15 = 169(0xa9, float:2.37E-43)
            goto L_0x00cf
        L_0x00ca:
            r15 = 168(0xa8, float:2.35E-43)
            goto L_0x00cf
        L_0x00cd:
            r15 = 167(0xa7, float:2.34E-43)
        L_0x00cf:
            r12.SetKey(r15)
            r13.add(r12)
            java.lang.String r6 = r0.f295955Q
            if (r6 == 0) goto L_0x00ee
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r7 = ha2.C32752h.f89141c
            boolean r7 = r7.check(r6)
            if (r7 == 0) goto L_0x00f0
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r7 = ha2.C32752h.f89141c
            java.lang.Object r6 = r7.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L_0x00f1
        L_0x00ee:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.String> r6 = ha2.C32752h.f89139a
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            java.lang.String r7 = r0.f295955Q
            if (r7 == 0) goto L_0x010a
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r11 = ha2.C32752h.f89142d
            boolean r11 = r11.check(r7)
            if (r11 == 0) goto L_0x010a
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r11 = ha2.C32752h.f89142d
            java.lang.Object r7 = r11.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            java.lang.String r11 = r0.f295955Q
            if (r11 == 0) goto L_0x0124
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r12 = ha2.C32752h.f89141c
            boolean r12 = r12.check(r11)
            if (r12 == 0) goto L_0x0124
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.Integer> r12 = ha2.C32752h.f89141c
            java.lang.Object r11 = r12.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L_0x0125
        L_0x0124:
            r11 = 0
        L_0x0125:
            r12 = 403(0x193, float:5.65E-43)
            if (r11 != r12) goto L_0x0142
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r4)
            r14 = 1
            r11.SetValue(r14)
            r4 = 700(0x2bc, float:9.81E-43)
            int r4 = qa2.C101081b.m132450c(r4)
            r11.SetKey(r4)
            r13.add(r11)
        L_0x0142:
            r4 = 1
            goto L_0x0221
        L_0x0145:
            java.lang.String r6 = r0.f295955Q
            java.lang.String r6 = ha2.C32752h.m39804c(r6)
            if (r6 == 0) goto L_0x0177
            java.lang.String r6 = r0.f295955Q
            java.lang.String r6 = ha2.C32752h.m39804c(r6)
            java.lang.String r7 = "text/html"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0177
            r6 = 701(0x2bd, float:9.82E-43)
            com.tencent.mars.smc.IDKey r7 = new com.tencent.mars.smc.IDKey
            r7.<init>()
            r7.SetID(r4)
            r11 = 1
            r7.SetValue(r11)
            int r4 = qa2.C101081b.m132450c(r6)
            r7.SetKey(r4)
            r13.add(r7)
            goto L_0x021f
        L_0x0177:
            r6 = 70
            if (r2 != r6) goto L_0x017d
            goto L_0x021e
        L_0x017d:
            r6 = 67
            if (r2 == r6) goto L_0x018a
            r6 = 74
            if (r2 == r6) goto L_0x018a
            switch(r2) {
                case 62: goto L_0x018a;
                case 63: goto L_0x018a;
                case 64: goto L_0x018a;
                default: goto L_0x0188;
            }
        L_0x0188:
            r6 = 0
            goto L_0x018b
        L_0x018a:
            r6 = 1
        L_0x018b:
            if (r6 == 0) goto L_0x01dc
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            r6.<init>()
            r6.SetID(r4)
            r14 = 1
            r6.SetValue(r14)
            int r4 = r0.f295959d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "getQQMusicPlayerDecodeErrIdKeyByMusicType, musicType:"
            r7.append(r14)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            if (r4 == 0) goto L_0x01d4
            if (r4 == r10) goto L_0x01d1
            if (r4 == r5) goto L_0x01ce
            switch(r4) {
                case 6: goto L_0x01cb;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01c2;
                case 10: goto L_0x01bf;
                case 11: goto L_0x01bc;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            r4 = 188(0xbc, float:2.63E-43)
            goto L_0x01d6
        L_0x01bc:
            r4 = 210(0xd2, float:2.94E-43)
            goto L_0x01d6
        L_0x01bf:
            r4 = 209(0xd1, float:2.93E-43)
            goto L_0x01d6
        L_0x01c2:
            r4 = 208(0xd0, float:2.91E-43)
            goto L_0x01d6
        L_0x01c5:
            r4 = 207(0xcf, float:2.9E-43)
            goto L_0x01d6
        L_0x01c8:
            r4 = 206(0xce, float:2.89E-43)
            goto L_0x01d6
        L_0x01cb:
            r4 = 205(0xcd, float:2.87E-43)
            goto L_0x01d6
        L_0x01ce:
            r4 = 204(0xcc, float:2.86E-43)
            goto L_0x01d6
        L_0x01d1:
            r4 = 203(0xcb, float:2.84E-43)
            goto L_0x01d6
        L_0x01d4:
            r4 = 202(0xca, float:2.83E-43)
        L_0x01d6:
            r6.SetKey(r4)
            r13.add(r6)
        L_0x01dc:
            int r4 = r0.f295959d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getQQMusicPlayerPlayErrIdKeyByMusicType, musicType:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            if (r4 == 0) goto L_0x0216
            if (r4 == r10) goto L_0x0213
            if (r4 == r5) goto L_0x0210
            switch(r4) {
                case 6: goto L_0x020d;
                case 7: goto L_0x020a;
                case 8: goto L_0x0207;
                case 9: goto L_0x0204;
                case 10: goto L_0x0201;
                case 11: goto L_0x01fe;
                default: goto L_0x01fb;
            }
        L_0x01fb:
            r15 = 188(0xbc, float:2.63E-43)
            goto L_0x0218
        L_0x01fe:
            r15 = 186(0xba, float:2.6E-43)
            goto L_0x0218
        L_0x0201:
            r15 = 185(0xb9, float:2.59E-43)
            goto L_0x0218
        L_0x0204:
            r15 = 184(0xb8, float:2.58E-43)
            goto L_0x0218
        L_0x0207:
            r15 = 183(0xb7, float:2.56E-43)
            goto L_0x0218
        L_0x020a:
            r15 = 182(0xb6, float:2.55E-43)
            goto L_0x0218
        L_0x020d:
            r15 = 181(0xb5, float:2.54E-43)
            goto L_0x0218
        L_0x0210:
            r15 = 180(0xb4, float:2.52E-43)
            goto L_0x0218
        L_0x0213:
            r15 = 179(0xb3, float:2.51E-43)
            goto L_0x0218
        L_0x0216:
            r15 = 178(0xb2, float:2.5E-43)
        L_0x0218:
            r12.SetKey(r15)
            r13.add(r12)
        L_0x021e:
            r6 = 0
        L_0x021f:
            r4 = 0
            r7 = 0
        L_0x0221:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 14777(0x39b9, float:2.0707E-41)
            r14 = 6
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r14[r16] = r15
            int r0 = r0.f295959d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r10] = r0
            r0 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14[r0] = r4
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r14[r0] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14[r5] = r0
            r0 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r14[r0] = r2
            r11.mo160131h(r12, r14)
            r13.add(r3)
            r13.add(r8)
            r13.add(r9)
            r11.mo160124a(r13, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qa2.C101084e.mo138804g0(qc0.m, int):void");
    }

    /* renamed from: l0 */
    public void mo138805l0(C101106m mVar, String str) {
        C101082c cVar = this.f295914b;
        cVar.getClass();
        if (TextUtils.isEmpty(str) && cVar.f295907j != null) {
            str = cVar.mo140534a();
        }
        Log.m105925i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType mineType:%s, hasStatForMimeType:%b", str, Boolean.valueOf(cVar.f295906i));
        if (!TextUtils.isEmpty(str) && !cVar.f295906i) {
            Log.m105924i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType OK");
            cVar.f295906i = true;
            IDKey iDKey = new IDKey();
            iDKey.SetID(JsApiSetLabInfo.CTRL_INDEX);
            iDKey.SetKey(MimeTypes.AUDIO_AMR_NB.equalsIgnoreCase(str) ? 70 : MimeTypes.AUDIO_AMR_WB.equalsIgnoreCase(str) ? 71 : (MimeTypes.AUDIO_MPEG.equalsIgnoreCase(str) || str.equalsIgnoreCase("audio/mp3")) ? 72 : ("audio/mp4a-latm".equalsIgnoreCase(str) || str.startsWith(MimeTypes.AUDIO_MP4)) ? 73 : "audio/qcelp".equalsIgnoreCase(str) ? 74 : MimeTypes.AUDIO_VORBIS.equalsIgnoreCase(str) ? 75 : MimeTypes.AUDIO_OPUS.equalsIgnoreCase(str) ? 76 : MimeTypes.AUDIO_ALAW.equalsIgnoreCase(str) ? 77 : MimeTypes.AUDIO_MLAW.equalsIgnoreCase(str) ? 78 : MimeTypes.AUDIO_RAW.equalsIgnoreCase(str) ? 79 : MimeTypes.AUDIO_FLAC.equalsIgnoreCase(str) ? 80 : MimeTypes.AUDIO_MSGSM.equalsIgnoreCase(str) ? 81 : MimeTypes.AUDIO_AC3.equalsIgnoreCase(str) ? 82 : MimeTypes.AUDIO_E_AC3.equalsIgnoreCase(str) ? 83 : "audio/x-ms-wma".equalsIgnoreCase(str) ? 84 : "audio/x-wav".equalsIgnoreCase(str) ? 85 : ("audio/x-ape".equalsIgnoreCase(str) || "application/x-ape".equalsIgnoreCase(str)) ? 86 : 87);
            iDKey.SetValue(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDKey);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160124a(arrayList, true);
            if (mVar != null) {
                nVar.mo160131h(14486, 0, Integer.valueOf(mVar.f295959d), Integer.valueOf(C101081b.m132448a(str)), str);
            }
        }
    }

    /* renamed from: w */
    public final void mo140535w(C101106m mVar, long j, long j2, long j3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50445ms3();
        bVar.f127067b = new C50588ns3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/reportmusic";
        bVar.f127069d = 2718;
        C47350c a = bVar.mo72403a();
        C50445ms3 ms32 = (C50445ms3) a.f127055a.f127080a;
        C50067k13 k132 = new C50067k13();
        ms32.f138182d = k132;
        C47800k kVar = this.f295916d;
        if (kVar != null) {
            k132.f136507d = kVar.f128354a;
            ms32.f138183e = kVar.f128355b;
            this.f295916d = null;
        }
        k132.f136508e = j2 + "";
        C50067k13 k133 = ms32.f138182d;
        k133.f136509f = j + "";
        C89144l0.m111429e(a, new C101085a(this), false);
    }

    /* renamed from: w0 */
    public void mo138806w0(C101106m mVar, boolean z) {
        C101083d.m132452a(mVar, z);
    }

    /* renamed from: z */
    public void mo138807z(C47800k kVar) {
        Log.m105924i("MicroMsg.Music.MusicWechatReportService", "reportMusicPlayerTime");
        if (kVar != null) {
            Log.m105925i("MicroMsg.Music.MusicWechatReportService", "MusicReportInfo h5CurrentMusicIDOfReport:%s, h5ReportListIDOfReport:%s", kVar.f128354a, kVar.f128355b);
        }
        C101106m k = C99364n.m129616h().mo138832k();
        if (!C99364n.m129616h().mo138822a().mo32206f() || k == null || k.f295959d != 10) {
            this.f295916d = kVar;
            Log.m105924i("MicroMsg.Music.MusicWechatReportService", "report music info");
            mo140535w((C101106m) null, 0, 0, 0);
            return;
        }
        this.f295916d = kVar;
        Log.m105924i("MicroMsg.Music.MusicWechatReportService", "H5 music is playing, not report first");
    }
}
