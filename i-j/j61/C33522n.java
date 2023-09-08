package j61;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.RePullEmojiInfoDescEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import k61.C33828d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C50470mz1;
import te3.C50614nz1;

/* renamed from: j61.n */
public class C33522n extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f90762d;

    /* renamed from: e */
    public C11385n f90763e;

    /* renamed from: f */
    public String f90764f = "";

    /* renamed from: g */
    public C33828d.C33829a f90765g;

    /* renamed from: h */
    public boolean f90766h = false;

    /* renamed from: i */
    public RePullEmojiInfoDescEvent f90767i = null;

    public C33522n(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50470mz1();
        bVar.f127067b = new C50614nz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getemotiondesc";
        bVar.f127069d = 521;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90762d = bVar.mo72403a();
        this.f90764f = str;
        this.f90767i = new RePullEmojiInfoDescEvent();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105919d("MicroMsg.emoji.NetSceneGetEmotionDesc", "getEmotionDesc %s ", this.f90764f);
        this.f90763e = nVar;
        String str = this.f90764f;
        ((C50470mz1) this.f90762d.f127055a.f127080a).f138292d = str;
        if (!TextUtils.isEmpty(str)) {
            return dispatch(gVar, this.f90762d, this);
        }
        Log.m105928w("MicroMsg.emoji.NetSceneGetEmotionDesc", "get emoji desc faild. product id is null.");
        return -1;
    }

    public int getType() {
        return 521;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r20, int r21, int r22, java.lang.String r23, com.tencent.p014mm.network.C114799u r24, byte[] r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.emoji.NetSceneGetEmotionDesc"
            if (r1 != 0) goto L_0x0144
            if (r2 != 0) goto L_0x0144
            boolean r6 = r0.f90766h
            if (r6 == 0) goto L_0x002d
            ob0.c r4 = r0.f90762d
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            te3.nz1 r4 = (te3.C50614nz1) r4
            int r4 = r4.f138860h
            r4 = r4 & r3
            if (r4 != r3) goto L_0x0026
            k61.d$a r3 = r0.f90765g
            k61.C33828d.m40153d(r3)
            goto L_0x0168
        L_0x0026:
            java.lang.String r3 = "new emotion is can't download. ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x0168
        L_0x002d:
            ob0.c r6 = r0.f90762d
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.nz1 r6 = (te3.C50614nz1) r6
            java.util.LinkedList<te3.d80> r6 = r6.f138857e
            java.lang.Class<aq.g> r7 = p441aq.C92054g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            aq.g r7 = (p441aq.C92054g) r7
            r7.getClass()
            com.tencent.mm.storage.w2 r7 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.f r7 = r7.mo57714a()
            java.lang.String r8 = r0.f90764f
            ob0.c r9 = r0.f90762d
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            r10 = r9
            te3.nz1 r10 = (te3.C50614nz1) r10
            int r10 = r10.f138858f
            te3.nz1 r9 = (te3.C50614nz1) r9
            int r9 = r9.f138860h
            android.content.SharedPreferences r11 = r7.f100772e
            if (r11 == 0) goto L_0x0080
            android.content.SharedPreferences$Editor r11 = r11.edit()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 274544(0x43070, float:3.84718E-40)
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            long r13 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r11 = r11.putLong(r12, r13)
            r11.commit()
        L_0x0080:
            if (r6 == 0) goto L_0x0123
            int r11 = r6.size()
            if (r11 > 0) goto L_0x008a
            goto L_0x0123
        L_0x008a:
            r11 = 0
            r12 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r7.f100771d
            boolean r15 = r14 instanceof zh3.C91753f
            if (r15 == 0) goto L_0x00a2
            r11 = r14
            zh3.f r11 = (zh3.C91753f) r11
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            long r12 = r12.getId()
            long r12 = r11.beginTransaction(r12)
        L_0x00a2:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r7.f100771d
            java.lang.String[] r15 = new java.lang.String[r3]
            r15[r4] = r8
            java.lang.String r4 = "EmojiInfoDesc"
            java.lang.String r3 = "groupId=?"
            r14.delete(r4, r3, r15)
            wh3.e r3 = new wh3.e
            r3.<init>()
            r3.field_groupId = r8
            r3.field_click_flag = r10
            r3.field_download_flag = r9
            java.util.Iterator r8 = r6.iterator()
        L_0x00be:
            boolean r9 = r8.hasNext()
            java.lang.String r10 = "md5_lang"
            if (r9 == 0) goto L_0x0115
            java.lang.Object r9 = r8.next()
            te3.d80 r9 = (te3.C49109d80) r9
            java.lang.String r14 = r9.f132178d
            r3.field_md5 = r14
            java.util.LinkedList<te3.pm2> r9 = r9.f132180f
            java.util.Iterator r9 = r9.iterator()
        L_0x00d6:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x00be
            java.lang.Object r14 = r9.next()
            te3.pm2 r14 = (te3.C50850pm2) r14
            java.lang.String r15 = r14.f139836e
            r3.field_desc = r15
            java.lang.String r14 = r14.f139835d
            r3.field_lang = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r3.field_md5
            r14.append(r15)
            java.lang.String r15 = r3.field_lang
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r3.field_md5_lang = r14
            android.content.ContentValues r14 = r3.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r7.f100771d
            long r14 = r15.replace(r4, r10, r14)
            r16 = 0
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x00d6
            if (r11 == 0) goto L_0x0123
            r11.endTransaction(r12)
            goto L_0x0123
        L_0x0115:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.f100771d
            android.content.ContentValues r3 = r3.convertTo()
            r7.replace(r4, r10, r3)
            if (r11 == 0) goto L_0x0123
            r11.endTransaction(r12)
        L_0x0123:
            if (r6 == 0) goto L_0x0168
            int r3 = r6.size()
            if (r3 <= 0) goto L_0x0168
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.f90764f
            r6 = 0
            r3[r6] = r4
            java.lang.String r4 = "end getEmojiDesc, productId: %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent r3 = r0.f90767i
            com.tencent.mm.autogen.events.RePullEmojiInfoDescEvent$a r4 = r3.f78897d
            java.lang.String r5 = r0.f90764f
            r4.f78898a = r5
            r3.publish()
            goto L_0x0168
        L_0x0144:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r6 = 0
            r3[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r6 = 1
            r3[r6] = r4
            r4 = 2
            java.lang.String r6 = r0.f90764f
            r3[r4] = r6
            java.lang.String r4 = "end getEmojiDesc, & errType:%d, errCode:%d, productId: %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            boolean r3 = r0.f90766h
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = "new emotion get des failed. ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x0168:
            ob0.n r3 = r0.f90763e
            r4 = r23
            r3.onSceneEnd(r1, r2, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j61.C33522n.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 50;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public C33522n(String str, C33828d.C33829a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50470mz1();
        bVar.f127067b = new C50614nz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getemotiondesc";
        bVar.f127069d = 521;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90762d = bVar.mo72403a();
        this.f90764f = str;
        this.f90765g = aVar;
        this.f90766h = true;
        this.f90767i = new RePullEmojiInfoDescEvent();
    }
}
