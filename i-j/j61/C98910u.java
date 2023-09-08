package j61;

import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import fw0.C87107w;
import i61.C98602h;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p008bq.C92280g1;
import p227rn.C48053v;
import p680ru.C77569h;
import p876cj.C67380a;
import p911ml.C99914f;
import p911ml.C99922k;
import pc0.C77068x;
import pe3.C89349b;
import sf0.C90188n0;
import te3.C101839s70;
import te3.C51018qv3;
import te3.C51353t70;
import te3.cn4;
import te3.dn4;
import u61.C101964h;
import z51.C39315g;

/* renamed from: j61.u */
public class C98910u extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f289946d;

    /* renamed from: e */
    public C11385n f289947e;

    /* renamed from: f */
    public EmojiInfo f289948f;

    /* renamed from: g */
    public boolean f289949g = true;

    /* renamed from: h */
    public boolean f289950h = false;

    /* renamed from: i */
    public long f289951i = 0;

    /* renamed from: j61.u$a */
    public class C98911a implements C99914f.C99915a {
        public C98911a() {
        }

        /* renamed from: a */
        public void mo91183a(int i, String str) {
            if (i == 0) {
                C98910u uVar = C98910u.this;
                uVar.f289950h = true;
                uVar.f289949g = true;
                if (uVar.doScene(uVar.dispatcher(), C98910u.this.f289947e) < 0) {
                    C98910u uVar2 = C98910u.this;
                    uVar2.f289947e.onSceneEnd(3, -1, "", uVar2);
                    return;
                }
                return;
            }
            C98910u uVar3 = C98910u.this;
            uVar3.f289947e.onSceneEnd(4, -2, "", uVar3);
        }
    }

    public C98910u(String str, String str2, EmojiInfo emojiInfo, long j) {
        int i = 1;
        Assert.assertTrue((str2 == null || str2.length() <= 0 || emojiInfo == null) ? false : true);
        this.f289951i = j;
        this.f289948f = emojiInfo;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new cn4());
        bVar.mo72407e(new dn4());
        bVar.mo72409g("/cgi-bin/micromsg-bin/sendemoji");
        bVar.mo72404b(WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO);
        bVar.mo72406d(68);
        bVar.mo72408f(1000000068);
        C47350c a = bVar.mo72403a();
        this.f289946d = a;
        ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57717d().Wa0(MMApplicationContext.getContext(), emojiInfo);
        cn4 cn4 = (cn4) a.mo72394a();
        C101839s70 s702 = new C101839s70();
        Log.m105925i("MicroMsg.emoji.NetSceneUploadEmoji", "NetSceneUploadEmoji: md5 %s, size %s", emojiInfo.getMd5(), Integer.valueOf(emojiInfo.getSize()));
        s702.f299379d = emojiInfo.getMd5();
        s702.f299387o = str;
        s702.f299384i = str2;
        s702.f299381f = emojiInfo.getSize();
        s702.f299385j = emojiInfo.getContent();
        s702.f299383h = emojiInfo.getType();
        s702.f299388p = C75569c4.m90679l();
        s702.f299389q = 0;
        if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(str2)) {
            s702.f299390r = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69662L3(str2);
        }
        i = C72996z1.m85820U5(str2) ? 2 : i;
        int group = emojiInfo.getGroup();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        if (group == 50) {
            s702.f299386n = "56,2," + i;
        } else if (emojiInfo.getGroup() == 49) {
            s702.f299386n = "56,1," + i;
        }
        cn4.f131846e.add(s702);
        cn4.f131845d = cn4.f131846e.size();
        ((C92280g1) C86312j.m106911c(C92280g1.class)).mo55791F0(emojiInfo.getMd5());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        byte[] bArr;
        this.f289947e = nVar;
        C101839s70 s702 = ((cn4) this.f289946d.f127055a.f127080a).f131846e.get(0);
        if (this.f289949g) {
            Log.m105924i("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, firstSend. md5=" + s702.f299379d);
            s702.f299382g = new C51018qv3();
            s702.f299380e = 0;
            return dispatch(gVar, this.f289946d, this);
        }
        EmojiInfo emojiInfo = this.f289948f;
        int i = emojiInfo.field_size;
        int i2 = emojiInfo.field_start;
        int i3 = i - i2;
        if (i3 > 8192) {
            i3 = 8192;
        }
        if ((emojiInfo.field_reserved4 & 1) == 1) {
            byte[] u = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138036u(this.f289948f);
            if (!Util.isNullOrNil(u)) {
                bArr = new byte[i3];
                Log.m105919d("MicroMsg.emoji.NetSceneUploadEmoji", "total length:%d dataLen:%d", Integer.valueOf(u.length), Integer.valueOf(i3));
                System.arraycopy(u, this.f289948f.field_start, bArr, 0, i3);
            } else {
                Log.m105928w("MicroMsg.emoji.NetSceneUploadEmoji", "buffer is null.");
                bArr = new byte[0];
            }
        } else {
            bArr = emojiInfo.mo135620r2(i2, i3);
        }
        if (C101964h.m134225g(bArr) == -1 && this.f289949g) {
            Log.m105920e("MicroMsg.emoji.NetSceneUploadEmoji", "Bitmap type error. delete emoji file.");
            this.f289948f.mo62645S0();
            return -1;
        } else if (bArr == null || bArr.length <= 0) {
            Log.m105920e("MicroMsg.emoji.NetSceneUploadEmoji", "readFromFile is null.");
            return -1;
        } else {
            int length = bArr.length;
            s702.f299380e = this.f289948f.field_start;
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73349j(C89349b.m111674a(bArr));
            s702.f299382g = qv32;
            if (((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(s702.f299384i)) {
                String a = ((C87107w.C75813c) C67380a.C67381a.f193260a).mo106106a(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f289951i));
                s702.f299388p = a;
                Log.m105919d("MicroMsg.emoji.NetSceneUploadEmoji", "MsgSource:%s", a);
            }
            Log.m105924i("MicroMsg.emoji.NetSceneUploadEmoji", "dispatcher, start:" + this.f289948f.field_start + ", total:" + this.f289948f.field_size + ", len:" + length);
            return dispatch(gVar, this.f289946d, this);
        }
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f289951i, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        Class cls = C77569h.class;
        Class cls2 = C75700k0.class;
        Class cls3 = C39315g.class;
        Log.m105924i("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd errtype:" + i2 + " errcode:" + i3);
        C47350c cVar = (C47350c) uVar;
        cn4 cn4 = (cn4) cVar.f127055a.f127080a;
        dn4 dn4 = (dn4) cVar.f127056b.f127083a;
        if (dn4 != null && (i2 == 4 || (i2 == 0 && i3 == 0))) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(dn4.f132436f);
        }
        if (i2 != 0 || i3 != 0) {
            this.f289947e.onSceneEnd(i2, i3, str, this);
        } else if (cn4.f131846e.size() != dn4.f132435e.size()) {
            Log.m105920e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + dn4.f132435e.size() + ", resp size:" + cn4.f131846e.size());
            this.f289947e.onSceneEnd(i2, i3, str, this);
        } else {
            C51353t70 t702 = dn4.f132435e.get(0);
            String str2 = t702.f142012g;
            if (str2 != null && str2.equals(this.f289948f.getMd5())) {
                int i5 = t702.f142010e;
                EmojiInfo emojiInfo = this.f289948f;
                if (i5 >= emojiInfo.field_start) {
                    int i6 = dn4.BaseResponse.f135955d;
                    if (i6 != 0) {
                        Log.m105921e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd failed. resp.BaseResponse.Ret:%d", Integer.valueOf(i6));
                        this.f289947e.onSceneEnd(4, -2, "", this);
                        return;
                    }
                    int i7 = t702.f142009d;
                    if (i7 != 0) {
                        Log.m105921e("MicroMsg.emoji.NetSceneUploadEmoji", "onGYNetEnd: respInfo Ret %s", Integer.valueOf(i7));
                        this.f289947e.onSceneEnd(4, -2, "", this);
                        return;
                    } else if (i5 >= t702.f142011f) {
                        Log.m105924i("MicroMsg.emoji.NetSceneUploadEmoji", "respInfo.getMsgID() " + t702.f142013h);
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(this.f289951i);
                        Log.m105925i("MicroMsg.emoji.NetSceneUploadEmoji", "dkmsgid  set svrmsgid %d -> %d", Long.valueOf(t702.f142014i), Integer.valueOf(C90188n0.f258951s));
                        if (10007 == C90188n0.f258950r && (i4 = C90188n0.f258951s) != 0) {
                            t702.f142013h = i4;
                            C90188n0.f258951s = 0;
                        }
                        b002.mo108745Y2(t702.f142014i);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(this.f289951i, b002);
                        EmojiInfo TO = ((C39315g) C86312j.m106911c(cls3)).mo58034O6().mo57717d().mo142044TO(this.f289948f.field_md5);
                        if (TO == null) {
                            TO = this.f289948f;
                        }
                        TO.field_start = 0;
                        TO.field_lastUseTime = System.currentTimeMillis();
                        TO.field_state = 3;
                        ((C39315g) C86312j.m106911c(cls3)).mo58034O6().mo57717d().X90(TO);
                        if (b002.mo101020w3()) {
                            ((C77569h) C86312j.m106911c(cls)).mo35239e8(b002, C40339m.m43520a(b002));
                        } else {
                            ((C77569h) C86312j.m106911c(cls)).mo35228B1(b002);
                        }
                        this.f289947e.onSceneEnd(i2, i3, "", this);
                        return;
                    } else if (this.f289950h) {
                        this.f289947e.onSceneEnd(4, -2, "", this);
                        return;
                    } else {
                        new C99922k(emojiInfo, false, new C98911a());
                        return;
                    }
                }
            }
            Log.m105920e("MicroMsg.emoji.NetSceneUploadEmoji", "invalid server return value; start=" + t702.f142010e + ", size=" + this.f289948f.field_size);
            this.f289947e.onSceneEnd(4, -2, "", this);
            this.f289948f.field_start = 0;
            ((C39315g) C86312j.m106911c(cls3)).mo58034O6().mo57717d().X90(this.f289948f);
        }
    }

    public int securityLimitCount() {
        return 256;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
