package j61;

import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import i61.C98602h;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import pe3.C89349b;
import te3.C51502u70;
import te3.C51656v70;
import te3.ym4;
import te3.zm4;
import z51.C39315g;

/* renamed from: j61.i */
public class C46438i extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125070d;

    /* renamed from: e */
    public C11385n f125071e;

    /* renamed from: f */
    public EmojiInfo f125072f;

    /* renamed from: g */
    public boolean f125073g = true;

    /* renamed from: h */
    public int f125074h = 256;

    /* renamed from: i */
    public long f125075i = System.currentTimeMillis();

    public C46438i(EmojiInfo emojiInfo) {
        Log.m105928w("MicroMsg.emoji.NetSceneEmojiUpload", "start upload at " + this.f125075i);
        this.f125072f = emojiInfo;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51502u70();
        bVar.f127067b = new C51656v70();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmemojiupload";
        bVar.f127069d = 703;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125070d = a;
        C51502u70 u702 = (C51502u70) a.f127055a.f127080a;
        ym4 ym4 = new ym4();
        if (this.f125072f != null) {
            C115669n.INSTANCE.mo175912v(164, 13);
            Log.m105925i("MicroMsg.emoji.NetSceneEmojiUpload", "NetSceneEmojiUpload: %s", this.f125072f.getMd5());
            ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57717d().Wa0(MMApplicationContext.getContext(), this.f125072f);
            ym4.f145403d = this.f125072f.getMd5();
            ym4.f145405f = this.f125072f.field_size;
            u702.f142636d.add(ym4);
            this.f125074h = (this.f125072f.field_size / 8192) * 2;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        Class cls = C39315g.class;
        this.f125071e = nVar;
        ym4 ym4 = ((C51502u70) this.f125070d.f127055a.f127080a).f142636d.get(0);
        int i2 = 8192;
        int i3 = -1;
        if (this.f125073g) {
            Log.m105918d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, firstSend. md5=" + ym4.f145403d);
            ym4.f145404e = 0;
            EmojiInfo emojiInfo = this.f125072f;
            int i4 = emojiInfo.field_size - 0;
            if (i4 <= 8192) {
                i2 = i4;
            }
            if ((emojiInfo.field_reserved4 & 1) == 1) {
                byte[] u = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138036u(this.f125072f);
                if (!Util.isNullOrNil(u)) {
                    bArr2 = new byte[i2];
                    Log.m105919d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d ", Integer.valueOf(u.length), Integer.valueOf(i2));
                    System.arraycopy(u, 0, bArr2, 0, i2);
                } else {
                    Log.m105928w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
                    bArr2 = new byte[0];
                }
            } else {
                bArr2 = emojiInfo.mo135620r2(0, i2);
            }
            if (bArr2 == null || bArr2.length <= 0) {
                Log.m105920e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
                return -1;
            }
            ym4.f145404e = 0;
            ym4.f145406g = new C89349b(bArr2, 0, bArr2.length);
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(bArr2.length);
            objArr[1] = Integer.valueOf(ym4.f145406g.f257327a.length);
            EmojiInfo emojiInfo2 = this.f125072f;
            objArr[2] = Integer.valueOf(emojiInfo2 == null ? -1 : emojiInfo2.field_start);
            EmojiInfo emojiInfo3 = this.f125072f;
            if (emojiInfo3 != null) {
                i3 = emojiInfo3.field_size;
            }
            objArr[3] = Integer.valueOf(i3);
            Log.m105925i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d dispatcher, first emoji start:%d emoji total:%d", objArr);
            return dispatch(gVar, this.f125070d, this);
        }
        EmojiInfo emojiInfo4 = this.f125072f;
        if (emojiInfo4 == null || (i = emojiInfo4.field_start) == 0) {
            Log.m105920e("MicroMsg.emoji.NetSceneEmojiUpload", "emoji info is null. or start position is 0.");
            return -1;
        }
        int i5 = emojiInfo4.field_size - i;
        if (i5 <= 8192) {
            i2 = i5;
        }
        if ((emojiInfo4.field_reserved4 & 1) == 1) {
            byte[] u2 = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138036u(this.f125072f);
            if (!Util.isNullOrNil(u2)) {
                bArr = new byte[i2];
                Log.m105919d("MicroMsg.emoji.NetSceneEmojiUpload", "total length:%d dataLen:%d", Integer.valueOf(u2.length), Integer.valueOf(i2));
                System.arraycopy(u2, this.f125072f.field_start, bArr, 0, i2);
            } else {
                Log.m105928w("MicroMsg.emoji.NetSceneEmojiUpload", "buffer is null.");
                bArr = new byte[0];
            }
        } else {
            bArr = emojiInfo4.mo135620r2(i, i2);
        }
        if (bArr == null || bArr.length <= 0) {
            Log.m105920e("MicroMsg.emoji.NetSceneEmojiUpload", "readFromFile is null.");
            return -1;
        }
        int length = bArr.length;
        ym4.f145404e = this.f125072f.field_start;
        ym4.f145406g = new C89349b(bArr, 0, bArr.length);
        Log.m105925i("MicroMsg.emoji.NetSceneEmojiUpload", "buf len:%d, string len:%d", Integer.valueOf(bArr.length), Integer.valueOf(ym4.f145406g.f257327a.length));
        Log.m105918d("MicroMsg.emoji.NetSceneEmojiUpload", "dispatcher, start:" + this.f125072f.field_start + ", total:" + this.f125072f.field_size + ", len:" + length);
        return dispatch(gVar, this.f125070d, this);
    }

    public int getType() {
        return 703;
    }

    /* renamed from: j1 */
    public final void mo71833j1(EmojiInfo emojiInfo, boolean z) {
        if (emojiInfo != null && !Util.isNullOrNil(emojiInfo.getMd5())) {
            Log.m105925i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] publicEmojiSyncTaskEvent emoji md5:%s success:%b", emojiInfo.getMd5(), Boolean.valueOf(z));
            EmojiSyncTaskEvent emojiSyncTaskEvent = new EmojiSyncTaskEvent();
            emojiSyncTaskEvent.f107420d.f107422b = emojiInfo.getMd5();
            EmojiSyncTaskEvent.C40056a aVar = emojiSyncTaskEvent.f107420d;
            aVar.f107421a = 0;
            aVar.f107423c = z;
            emojiSyncTaskEvent.publish();
            long currentTimeMillis = System.currentTimeMillis() - this.f125075i;
            Log.m105928w("MicroMsg.emoji.NetSceneEmojiUpload", "finish cost " + currentTimeMillis + " size " + emojiInfo.field_size + " rate " + (((long) emojiInfo.field_size) / currentTimeMillis));
        }
    }

    /* renamed from: k1 */
    public void mo71834k1() {
        this.f125072f.field_start = 0;
        ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57717d().r50(this.f125072f);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        Class cls = C39315g.class;
        Log.m105924i("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd  errtype:" + i4 + " errcode:" + i5);
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = (C47350c) uVar;
            C51502u70 u702 = (C51502u70) cVar.f127055a.f127080a;
            C51656v70 v702 = (C51656v70) cVar.f127056b.f127083a;
            if (u702.f142636d.size() != v702.f143373d.size()) {
                Log.m105920e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. RequestSize not equal RespSize. req size:" + u702.f142636d.size() + ", resp size:" + v702.f143373d.size());
                mo71834k1();
                this.f125071e.onSceneEnd(i4, i5, str3, this);
                mo71833j1(this.f125072f, false);
                return;
            }
            zm4 zm4 = null;
            LinkedList<zm4> linkedList = v702.f143373d;
            if (linkedList != null && linkedList.size() > 0) {
                zm4 = v702.f143373d.get(0);
            }
            if (!(zm4 == null || (str2 = zm4.f146099g) == null || !str2.equals(this.f125072f.getMd5()))) {
                int i6 = zm4.f146097e;
                EmojiInfo emojiInfo = this.f125072f;
                if (i6 >= emojiInfo.field_start) {
                    if (emojiInfo == null || zm4.f146096d == 0 || i6 != zm4.f146098f || i6 <= 0) {
                        int i7 = v702.BaseResponse.f135955d;
                        if (i7 == 0 && zm4.f146096d == 0) {
                            if (this.f125073g) {
                                this.f125073g = false;
                            }
                            if (i6 >= zm4.f146098f) {
                                emojiInfo.field_start = 0;
                                emojiInfo.field_state = 3;
                                emojiInfo.field_needupload = 0;
                                ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().r50(this.f125072f);
                                this.f125071e.onSceneEnd(i4, i5, "", this);
                                mo71833j1(this.f125072f, true);
                                Log.m105924i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success.");
                                return;
                            }
                            Log.m105925i("MicroMsg.emoji.NetSceneEmojiUpload", "next start pos is :%d", Integer.valueOf(i6));
                            this.f125072f.field_start = zm4.f146097e;
                            ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d().r50(this.f125072f);
                            if (doScene(dispatcher(), this.f125071e) < 0) {
                                this.f125071e.onSceneEnd(3, -1, "", this);
                                mo71833j1(this.f125072f, false);
                                return;
                            }
                            return;
                        }
                        Log.m105921e("MicroMsg.emoji.NetSceneEmojiUpload", "onGYNetEnd failed. resp.BaseResponse.Ret:%d respInfo.Ret:%d", Integer.valueOf(i7), Integer.valueOf(zm4.f146096d));
                        mo71834k1();
                        this.f125071e.onSceneEnd(i4, i5, "", this);
                        return;
                    }
                    Log.m105925i("MicroMsg.emoji.NetSceneEmojiUpload", "[cpan] emoji upload success, but md5 backup faild.try to do batch emoji backup. %s respInfo.Ret:%d respInfo.StartPos:%d respInfo.TotalLen:%d", emojiInfo.getMd5(), Integer.valueOf(zm4.f146096d), Integer.valueOf(zm4.f146097e), Integer.valueOf(zm4.f146098f));
                    mo71834k1();
                    this.f125071e.onSceneEnd(i4, i5, "", this);
                    return;
                }
            }
            Object[] objArr = new Object[5];
            objArr[0] = zm4.f146099g;
            objArr[1] = Integer.valueOf(zm4.f146098f);
            objArr[2] = Integer.valueOf(zm4.f146097e);
            EmojiInfo emojiInfo2 = this.f125072f;
            objArr[3] = Integer.valueOf(emojiInfo2 == null ? -1 : emojiInfo2.field_start);
            EmojiInfo emojiInfo3 = this.f125072f;
            objArr[4] = Integer.valueOf(emojiInfo3 == null ? -1 : emojiInfo3.field_size);
            Log.m105921e("MicroMsg.emoji.NetSceneEmojiUpload", "md5:%s invalid server return value. respInfo.TotalLen:%d respInfo.StartPos:%d emoji.getStart():%d emoji total:%d", objArr);
            mo71834k1();
            this.f125071e.onSceneEnd(4, -2, "", this);
            mo71833j1(this.f125072f, false);
            return;
        }
        mo71834k1();
        this.f125071e.onSceneEnd(i4, i5, str3, this);
        mo71833j1(this.f125072f, false);
    }

    public int securityLimitCount() {
        return this.f125074h;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
