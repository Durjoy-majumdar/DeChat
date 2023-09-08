package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sendtowework.BaseDataToWeWork;
import com.tencent.p014mm.sendtowework.FileData;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaFile;
import com.tencent.wework.api.model.WWMediaMergedConvs;
import com.tencent.wework.api.model.WWMediaMessage;
import com.tencent.wework.api.model.WWMediaText;
import com.tencent.wework.api.model.WWMediaVideo;
import java.util.List;
import nj3.C76879j;
import nm2.C76933e;
import p645pj.C77092c;
import s90.C77632o;

/* renamed from: com.tencent.mm.ui.chatting.r4 */
public class C97182r4 {
    /* renamed from: a */
    public static void m125138a(Context context, C72996z1 z1Var, List<C72963f4> list, boolean z, IWWAPI.WWAppType wWAppType, int i) {
        IWWAPI a = WWAPIFactory.m125312a(context);
        try {
            WWMediaMessage.WWMediaObject b = m125139b(context, z1Var, list, z);
            ((WWMediaMergedConvs) b).f285817g = i;
            a.mo136603a(b, wWAppType);
            C76933e.m92785a().mo107270d(1);
        } catch (r4$$g unused) {
            C76879j.m92748s(context, context.getResources().getString(C0966R.string.ilu, new Object[]{Long.valueOf(C77092c.m93047i() / 1048576)}), context.getResources().getString(C0966R.string.a3h));
            C76933e.m92785a().mo107270d(2);
        }
        C76933e.m92785a().mo107268b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.tencent.wework.api.model.WWMediaMergedConvs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.tencent.wework.api.model.WWMediaMiniProgram} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.tencent.wework.api.model.WWMediaLink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: com.tencent.wework.api.model.WWMediaLocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: com.tencent.wework.api.model.WWMediaFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: com.tencent.wework.api.model.WWMediaImage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: com.tencent.wework.api.model.WWMediaText} */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r7v66, types: [com.tencent.wework.api.model.WWMediaFile, com.tencent.wework.api.model.WWMediaVideo] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:108|109|110|111|112) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x03ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x052d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0549 A[SYNTHETIC, Splitter:B:163:0x0549] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x055b A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.wework.api.model.WWMediaMessage.WWMediaObject m125139b(android.content.Context r19, com.tencent.p014mm.storage.C72996z1 r20, java.util.List<com.tencent.p014mm.storage.C72963f4> r21, boolean r22) {
        /*
            r1 = r19
            r2 = r22
            java.lang.Class<d62.i> r3 = d62.C75339i.class
            com.tencent.wework.api.model.WWMediaMergedConvs r4 = new com.tencent.wework.api.model.WWMediaMergedConvs
            r4.<init>()
            java.lang.String r0 = r20.getUsername()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0020
            r0 = 2131834443(0x7f11364b, float:1.9301996E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x004d
        L_0x0020:
            java.lang.String r9 = eb0.C75592q0.m90783m()
            di3.d r10 = di3.C86312j.m106911c(r3)
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r0 = r10.mo62514P1(r0)
            boolean r10 = r9.equals(r0)
            if (r10 == 0) goto L_0x0040
            r0 = 2131825738(0x7f11144a, float:1.928434E38)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r7] = r9
            java.lang.String r0 = r5.getString(r0, r10)
            goto L_0x004d
        L_0x0040:
            r10 = 2131825737(0x7f111449, float:1.9284339E38)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r7] = r9
            r11[r8] = r0
            java.lang.String r0 = r5.getString(r10, r11)
        L_0x004d:
            r4.f285818c = r0
            java.util.Iterator r5 = r21.iterator()
        L_0x0053:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05d8
            java.lang.Object r0 = r5.next()
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
            com.tencent.wework.api.model.WWMediaConversation r9 = new com.tencent.wework.api.model.WWMediaConversation
            r9.<init>()
            int r10 = r0.mo108769t2()
            if (r10 != r8) goto L_0x006f
            java.lang.String r10 = eb0.C75592q0.m90789s()
            goto L_0x007e
        L_0x006f:
            if (r2 != 0) goto L_0x0076
            java.lang.String r10 = r0.mo108768t()
            goto L_0x007e
        L_0x0076:
            java.lang.String r10 = r0.getContent()
            java.lang.String r10 = eb0.C75604z3.m90847s(r10)
        L_0x007e:
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            k40.a r11 = f40.C86709a0.m107533q(r11)
            f62.k0 r11 = (f62.C75700k0) r11
            com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
            com.tencent.mm.storage.z1 r11 = r11.get(r10)
            java.lang.String r11 = qe0.C47806g.m53116a(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            di3.d r13 = di3.C86312j.m106911c(r3)
            d62.i r13 = (d62.C75339i) r13
            java.lang.String r13 = r13.mo62514P1(r10)
            r12.append(r13)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r9.f285803f = r11
            r11 = 50
            android.graphics.Bitmap r10 = com.tencent.p014mm.modelavatar.C68081f.m80466a(r10)     // Catch:{ Exception -> 0x00cc }
            if (r10 == 0) goto L_0x00cc
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00cc }
            r12.<init>()     // Catch:{ Exception -> 0x00cc }
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00cc }
            r10.compress(r13, r11, r12)     // Catch:{ Exception -> 0x00cc }
            byte[] r10 = r12.toByteArray()     // Catch:{ Exception -> 0x00cc }
            r9.f285805h = r10     // Catch:{ Exception -> 0x00cc }
            r12.close()     // Catch:{ Exception -> 0x00cc }
        L_0x00cc:
            long r12 = r0.getCreateTime()
            r9.f285804g = r12
            java.lang.Class<gt.k> r10 = p158gt.C98201k.class
            int r12 = r0.getType()
            boolean r13 = eb0.C75569c4.m90686s(r0)
            if (r13 == 0) goto L_0x00ec
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r10 = 2131821588(0x7f110414, float:1.9275923E38)
            java.lang.String r10 = r1.getString(r10)
            r0.<init>(r10)
            goto L_0x032d
        L_0x00ec:
            if (r12 != r8) goto L_0x0104
            java.lang.String r10 = r0.getContent()
            int r0 = r0.mo108769t2()
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88760d(r10, r0, r2)
            com.tencent.wework.api.model.WWMediaText r10 = new com.tencent.wework.api.model.WWMediaText
            r10.<init>(r0)
            r11 = r20
            r0 = r10
            goto L_0x056b
        L_0x0104:
            java.lang.String r13 = "send img2, path:%s"
            java.lang.String r14 = ""
            r15 = 0
            r11 = 3
            java.lang.String r6 = "MicroMsg.SendToWeWorkHelper"
            if (r12 != r11) goto L_0x018e
            long r11 = r0.getMsgId()
            int r18 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x0131
            di3.d r11 = di3.C86312j.m106911c(r10)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            java.lang.String r12 = r0.mo108768t()
            long r7 = r0.getMsgId()
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            com.tencent.mm.modelimage.k r7 = r11.mo127200vP(r12, r7)
            goto L_0x0132
        L_0x0131:
            r7 = 0
        L_0x0132:
            if (r7 == 0) goto L_0x013a
            long r11 = r7.f267374a
            int r8 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x015a
        L_0x013a:
            long r11 = r0.mo108774y2()
            int r8 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x015a
            di3.d r7 = di3.C86312j.m106911c(r10)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r8 = r0.mo108768t()
            long r11 = r0.mo108774y2()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            com.tencent.mm.modelimage.k r7 = r7.mo127168NQ(r8, r11)
        L_0x015a:
            if (r7 != 0) goto L_0x015f
            r0 = 0
            goto L_0x032d
        L_0x015f:
            di3.d r0 = di3.C86312j.m106911c(r10)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.Class<gt.l> r8 = p158gt.C76053l.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            gt.l r8 = (p158gt.C76053l) r8
            java.lang.String r7 = r8.mo106262y8(r7)
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            r8 = 1
            java.lang.String r0 = r0.mo127174TY(r7, r14, r14, r8)
            com.tencent.wework.api.model.WWMediaImage r7 = new com.tencent.wework.api.model.WWMediaImage
            r7.<init>()
            r7.f285808g = r0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r8 = 0
            r10[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r10)
            r0 = r7
            goto L_0x032d
        L_0x018e:
            r7 = 43
            if (r12 != r7) goto L_0x01d4
            com.tencent.wework.api.model.WWMediaVideo r7 = new com.tencent.wework.api.model.WWMediaVideo
            r7.<init>()
            java.lang.Class<rz.u> r8 = p682rz.C101491u.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            rz.u r8 = (p682rz.C101491u) r8
            java.lang.String r0 = r0.mo108765s2()
            hd0.n0 r0 = r8.mo140806Zd(r0)
            java.lang.Class<rz.s> r8 = p682rz.C101488s.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            rz.s r8 = (p682rz.C101488s) r8
            rz.t r8 = r8.Kj0()
            java.lang.String r0 = r0.mo137700d()
            hd0.o0 r8 = (hd0.C98410o0) r8
            java.lang.String r0 = r8.mo137728q(r0)
            r8 = 0
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r8)
            r7.f285808g = r0
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r8] = r0
            java.lang.String r0 = "send video2, path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r11)
            r11 = r20
            r0 = r7
            goto L_0x056b
        L_0x01d4:
            r7 = 48
            if (r12 != r7) goto L_0x0210
            com.tencent.wework.api.model.WWMediaLocation r6 = new com.tencent.wework.api.model.WWMediaLocation
            r6.<init>()
            java.lang.String r7 = r0.getContent()
            int r0 = r0.mo108769t2()
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88760d(r7, r0, r2)
            eb0.c r7 = eb0.C97625j3.m125812b()
            g62.l r7 = r7.mo105911z()
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            com.tencent.mm.storage.f4$e r0 = r7.Tx0(r0)
            java.lang.String r7 = r0.f212708f
            r6.f285818c = r7
            java.lang.String r7 = r0.f212707e
            r6.f285812f = r7
            double r7 = r0.f212705c
            r6.f285813g = r7
            double r7 = r0.f212704b
            r6.f285814h = r7
            int r0 = r0.f212706d
            double r7 = (double) r0
            r6.f285815i = r7
        L_0x020c:
            r11 = r20
            goto L_0x056a
        L_0x0210:
            r7 = 49
            r8 = 2131835501(0x7f113a6d, float:1.9304142E38)
            if (r12 == r7) goto L_0x02cc
            r7 = 268435505(0x10000031, float:2.5243696E-29)
            if (r12 == r7) goto L_0x02cc
            r7 = 1090519089(0x41000031, float:8.000047)
            if (r12 != r7) goto L_0x0223
            goto L_0x02cc
        L_0x0223:
            boolean r7 = r0.mo100995g4()
            if (r7 == 0) goto L_0x0237
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835502(0x7f113a6e, float:1.9304144E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x0237:
            boolean r7 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88747F(r0)
            if (r7 == 0) goto L_0x024b
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835499(0x7f113a6b, float:1.9304138E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x024b:
            boolean r7 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88768l(r0)
            if (r7 == 0) goto L_0x025f
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835490(0x7f113a62, float:1.930412E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x025f:
            boolean r7 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88776t(r0)
            if (r7 == 0) goto L_0x0273
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835491(0x7f113a63, float:1.9304122E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x0273:
            boolean r7 = r0.mo100973L3()
            if (r7 == 0) goto L_0x0287
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835492(0x7f113a64, float:1.9304124E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x0287:
            int r7 = r0.getType()
            r10 = 754974769(0x2d000031, float:7.276E-12)
            if (r7 != r10) goto L_0x029e
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835493(0x7f113a65, float:1.9304126E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x029e:
            boolean r0 = r0.mo100962B3()
            if (r0 == 0) goto L_0x02b2
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            r6 = 2131835494(0x7f113a66, float:1.9304128E38)
            java.lang.String r6 = r1.getString(r6)
            r0.<init>(r6)
            goto L_0x032d
        L_0x02b2:
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r10 = 0
            r0[r10] = r7
            java.lang.String r7 = "unsupport msg type: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r0)
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            java.lang.String r6 = r1.getString(r8)
            r0.<init>(r6)
            goto L_0x032d
        L_0x02cc:
            java.lang.String r7 = r0.getContent()
            if (r2 == 0) goto L_0x02e9
            java.lang.String r12 = r0.getContent()
            r15 = 58
            int r12 = r12.indexOf(r15)
            r15 = -1
            if (r12 == r15) goto L_0x02e9
            java.lang.String r7 = r0.getContent()
            int r12 = r12 + 1
            java.lang.String r7 = r7.substring(r12)
        L_0x02e9:
            if (r7 == 0) goto L_0x02f4
            java.lang.String r12 = r0.mo108775z2()
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r12)
            goto L_0x02f5
        L_0x02f4:
            r7 = 0
        L_0x02f5:
            if (r7 != 0) goto L_0x02ff
        L_0x02f7:
            r11 = r20
            r8 = 0
        L_0x02fa:
            r10 = 0
            r12 = 1
            r14 = 2
            goto L_0x05cd
        L_0x02ff:
            int r12 = r7.f195582i
            r15 = 2
            if (r12 == r15) goto L_0x056f
            r13 = 19
            if (r12 == r13) goto L_0x048d
            r13 = 33
            r14 = 6
            r15 = 5
            r11 = 4
            if (r12 == r13) goto L_0x03dc
            if (r12 == r11) goto L_0x036b
            if (r12 == r15) goto L_0x036b
            if (r12 == r14) goto L_0x0331
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r10 = 0
            r0[r10] = r7
            java.lang.String r7 = "getWWMsgFromAppMsg: unsupport content.type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r0)
            com.tencent.wework.api.model.WWMediaText r0 = new com.tencent.wework.api.model.WWMediaText
            java.lang.String r6 = r1.getString(r8)
            r0.<init>(r6)
        L_0x032d:
            r11 = r20
            goto L_0x056b
        L_0x0331:
            java.lang.String r6 = r7.f195606o
            com.tencent.mm.pluginsdk.model.app.d r6 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r6)
            if (r6 != 0) goto L_0x0345
            com.tencent.mm.pluginsdk.model.app.e r6 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            long r10 = r0.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r6 = r6.mo100150Yt(r10)
        L_0x0345:
            long r10 = p645pj.C77092c.m93047i()
            long r12 = r6.field_totalLen
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0365
            com.tencent.wework.api.model.WWMediaFile r0 = new com.tencent.wework.api.model.WWMediaFile
            r0.<init>()
            java.lang.String r7 = r7.f195570f
            r0.f285809h = r7
            java.lang.String r6 = r6.field_fileFullPath
            r7 = 0
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r7)
            r0.f285808g = r6
            int r6 = (int) r10
            r0.f285807f = r6
            goto L_0x032d
        L_0x0365:
            com.tencent.mm.ui.chatting.r4$$g r0 = new com.tencent.mm.ui.chatting.r4$$g
            r0.<init>()
            throw r0
        L_0x036b:
            com.tencent.wework.api.model.WWMediaLink r6 = new com.tencent.wework.api.model.WWMediaLink
            r6.<init>()
            java.lang.String r8 = r7.f195586j
            r6.f285811f = r8
            java.lang.String r8 = r7.f195570f
            r6.f285818c = r8
            java.lang.String r7 = r7.f195574g
            r6.f285819d = r7
            di3.d r7 = di3.C86312j.m106911c(r10)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r8 = r0.mo108765s2()
            r11 = 0
            float r12 = kg3.C76577a.m92156g(r11)
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            r11 = 0
            android.graphics.Bitmap r7 = r7.mo127188jo(r8, r12, r11)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x03ab }
            r8.<init>()     // Catch:{ Exception -> 0x03ab }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x03ab }
            r12 = 85
            r7.compress(r11, r12, r8)     // Catch:{ Exception -> 0x03ab }
            byte[] r7 = r8.toByteArray()     // Catch:{ Exception -> 0x03ab }
            r6.f285820e = r7     // Catch:{ Exception -> 0x03ab }
            r8.close()     // Catch:{ Exception -> 0x03ab }
        L_0x03ab:
            di3.d r7 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x020c }
            gt.k r7 = (p158gt.C98201k) r7     // Catch:{ Exception -> 0x020c }
            gt.m r7 = r7.mo137277xi()     // Catch:{ Exception -> 0x020c }
            java.lang.String r0 = r0.mo108765s2()     // Catch:{ Exception -> 0x020c }
            r8 = 0
            float r8 = kg3.C76577a.m92156g(r8)     // Catch:{ Exception -> 0x020c }
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7     // Catch:{ Exception -> 0x020c }
            r10 = 0
            android.graphics.Bitmap r0 = r7.mo127188jo(r0, r8, r10)     // Catch:{ Exception -> 0x020c }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x020c }
            r7.<init>()     // Catch:{ Exception -> 0x020c }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x020c }
            r10 = 100
            r0.compress(r8, r10, r7)     // Catch:{ Exception -> 0x020c }
            byte[] r0 = r7.toByteArray()     // Catch:{ Exception -> 0x020c }
            r6.f285820e = r0     // Catch:{ Exception -> 0x020c }
            r7.close()     // Catch:{ Exception -> 0x020c }
            goto L_0x020c
        L_0x03dc:
            int r8 = r7.f195581h2
            r12 = 3
            if (r8 != r12) goto L_0x03e3
            goto L_0x02f7
        L_0x03e3:
            com.tencent.wework.api.model.WWMediaMiniProgram r8 = new com.tencent.wework.api.model.WWMediaMiniProgram
            r8.<init>()
            java.lang.String r12 = r7.f195573f2
            r8.f285821f = r12
            java.lang.String r12 = r7.f195569e2
            r8.f285822g = r12
            java.lang.String r12 = r7.f195471B2
            r8.f285824i = r12
            di3.d r10 = di3.C86312j.m106911c(r10)
            gt.k r10 = (p158gt.C98201k) r10
            gt.m r10 = r10.mo137277xi()
            java.lang.String r0 = r0.mo108765s2()
            com.tencent.mm.modelimage.m r10 = (com.tencent.p014mm.modelimage.C92839m) r10
            java.lang.String r0 = r10.h30(r0)
            boolean r10 = rd3.C48020a.m53385b(r0)
            if (r10 == 0) goto L_0x043e
            android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.gallery.model.C93969m.m118772b(r0)     // Catch:{ Exception -> 0x0429 }
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0429 }
            r10.<init>()     // Catch:{ Exception -> 0x0429 }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0429 }
            r13 = 70
            r0.compress(r12, r13, r10)     // Catch:{ Exception -> 0x0429 }
            byte[] r0 = r10.toByteArray()     // Catch:{ Exception -> 0x0429 }
            r8.f285823h = r0     // Catch:{ Exception -> 0x0429 }
            r10.close()     // Catch:{ Exception -> 0x0429 }
            r10 = 1
            goto L_0x0443
        L_0x0429:
            r0 = move-exception
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.String r0 = r0.getMessage()
            r13 = 0
            r12[r13] = r0
            java.lang.String r0 = "WWMediaMiniProgram.hdImageData Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r12)
            byte[] r0 = new byte[r10]
            r8.f285823h = r0
            goto L_0x0443
        L_0x043e:
            r10 = 1
            byte[] r0 = new byte[r10]
            r8.f285823h = r0
        L_0x0443:
            byte[] r0 = r8.f285823h
            int r0 = r0.length
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r12) goto L_0x0454
            java.lang.String r0 = "miniProgram.hdImageData.length > 1M"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            byte[] r0 = new byte[r10]
            r8.f285823h = r0
        L_0x0454:
            java.lang.String r0 = r7.f195638w
            r8.f285825j = r0
            java.lang.String r0 = r7.f195570f
            r8.f285818c = r0
            int r0 = r7.f195581h2
            r8.f285826k = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r7 = r8.f285821f
            r10 = 0
            r0[r10] = r7
            java.lang.String r7 = r8.f285822g
            r10 = 1
            r0[r10] = r7
            java.lang.String r7 = r8.f285824i
            r10 = 2
            r0[r10] = r7
            byte[] r7 = r8.f285823h
            int r7 = r7.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 3
            r0[r10] = r7
            java.lang.String r7 = r8.f285825j
            r0[r11] = r7
            java.lang.String r7 = r8.f285818c
            r0[r15] = r7
            java.lang.String r7 = "WWMediaMiniProgram[username:%s path:%s iconUrl:%s hdImageData:%s name:%s title:%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            r11 = r20
            r0 = r8
            goto L_0x056b
        L_0x048d:
            java.lang.String r6 = r0.getContent()
            java.lang.String r7 = r0.mo108768t()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x04a3
            java.lang.String r6 = r0.getContent()
            java.lang.String r6 = eb0.C75604z3.m90849u(r6)
        L_0x04a3:
            r8 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r8)
            if (r6 == 0) goto L_0x04b1
            java.lang.String r6 = r6.f195571f0
            te3.dp3 r11 = qg2.C101147j0.m132643x(r6)
            goto L_0x04b2
        L_0x04b1:
            r11 = r8
        L_0x04b2:
            com.tencent.wework.api.model.WWMediaMergedConvs r6 = new com.tencent.wework.api.model.WWMediaMergedConvs
            r6.<init>()
            if (r11 != 0) goto L_0x04bb
            goto L_0x020c
        L_0x04bb:
            java.lang.String r7 = r11.f227153d
            r6.f285818c = r7
            java.util.LinkedList<te3.rc0> r7 = r11.f227155f
            java.util.Iterator r7 = r7.iterator()
        L_0x04c5:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x020c
            java.lang.Object r8 = r7.next()
            te3.rc0 r8 = (te3.C101834rc0) r8
            com.tencent.wework.api.model.WWMediaConversation r10 = new com.tencent.wework.api.model.WWMediaConversation
            r10.<init>()
            java.lang.String r11 = r8.f299298d1
            java.lang.String r12 = r8.f299245B1
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x04e3
            r10.f285803f = r11
            goto L_0x04f6
        L_0x04e3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = r8.f299245B1
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.f285803f = r11
        L_0x04f6:
            te3.sc0 r11 = r8.f299296c1     // Catch:{ Exception -> 0x052b }
            te3.tc0 r11 = r11.f299405d     // Catch:{ Exception -> 0x052b }
            boolean r12 = r11.f299520g     // Catch:{ Exception -> 0x052b }
            if (r12 == 0) goto L_0x0501
            java.lang.String r11 = r11.f299519f     // Catch:{ Exception -> 0x052b }
            goto L_0x0509
        L_0x0501:
            boolean r12 = r11.f299526p     // Catch:{ Exception -> 0x052b }
            if (r12 == 0) goto L_0x0508
            java.lang.String r11 = r11.f299525o     // Catch:{ Exception -> 0x052b }
            goto L_0x0509
        L_0x0508:
            r11 = r14
        L_0x0509:
            java.lang.Class<ln.i> r12 = p196ln.C76708i.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x052b }
            ln.i r12 = (p196ln.C76708i) r12     // Catch:{ Exception -> 0x052b }
            android.graphics.Bitmap r11 = r12.N50(r11)     // Catch:{ Exception -> 0x052b }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x052b }
            r12.<init>()     // Catch:{ Exception -> 0x052b }
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x052b }
            r15 = 50
            r11.compress(r13, r15, r12)     // Catch:{ Exception -> 0x052d }
            byte[] r11 = r12.toByteArray()     // Catch:{ Exception -> 0x052d }
            r10.f285805h = r11     // Catch:{ Exception -> 0x052d }
            r12.close()     // Catch:{ Exception -> 0x052d }
            goto L_0x052d
        L_0x052b:
            r15 = 50
        L_0x052d:
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0540 }
            java.lang.String r12 = "yyyy-MM-dd HH:mm:ss"
            r11.<init>(r12)     // Catch:{ ParseException -> 0x0540 }
            java.lang.String r12 = r8.f299302f1     // Catch:{ ParseException -> 0x0540 }
            java.util.Date r11 = r11.parse(r12)     // Catch:{ ParseException -> 0x0540 }
            long r11 = r11.getTime()     // Catch:{ ParseException -> 0x0540 }
            goto L_0x0543
        L_0x0540:
            r11 = 0
        L_0x0543:
            r16 = 0
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x055b
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x055b }
            java.lang.String r15 = "yyyy-MM-dd HH:mm"
            r13.<init>(r15)     // Catch:{ ParseException -> 0x055b }
            java.lang.String r15 = r8.f299302f1     // Catch:{ ParseException -> 0x055b }
            java.util.Date r13 = r13.parse(r15)     // Catch:{ ParseException -> 0x055b }
            long r11 = r13.getTime()     // Catch:{ ParseException -> 0x055b }
        L_0x055b:
            r10.f285804g = r11
            r11 = r20
            com.tencent.wework.api.model.WWMediaMessage$WWMediaObject r8 = m125140c(r11, r8, r0, r2)
            r10.f285806i = r8
            r6.mo136620g(r10)
            goto L_0x04c5
        L_0x056a:
            r0 = r6
        L_0x056b:
            r10 = 0
            r12 = 1
            r14 = 2
            goto L_0x05ce
        L_0x056f:
            r11 = r20
            r8 = 0
            java.lang.String r10 = r7.f195606o
            if (r10 == 0) goto L_0x02fa
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x02fa
            com.tencent.mm.pluginsdk.model.app.e r10 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r7 = r7.f195606o
            com.tencent.mm.pluginsdk.model.app.d r7 = r10.mo100154qq(r7)
            if (r7 == 0) goto L_0x02fa
            boolean r10 = r7.mo100146l2()
            if (r10 != 0) goto L_0x0590
            goto L_0x02fa
        L_0x0590:
            java.lang.String r7 = r7.field_fileFullPath
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r10 != 0) goto L_0x05bb
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r12 = 0
            r10[r12] = r7
            long r12 = r0.getMsgId()
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r12 = 1
            r10[r12] = r7
            long r13 = r0.mo108774y2()
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r14 = 2
            r10[r14] = r0
            java.lang.String r0 = "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r10)
            r10 = 0
            goto L_0x05cd
        L_0x05bb:
            r12 = 1
            r14 = 2
            com.tencent.wework.api.model.WWMediaImage r0 = new com.tencent.wework.api.model.WWMediaImage
            r0.<init>()
            r0.f285808g = r7
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r10 = 0
            r8[r10] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r8)
            goto L_0x05ce
        L_0x05cd:
            r0 = r8
        L_0x05ce:
            r9.f285806i = r0
            r4.mo136620g(r9)
            r6 = 2
            r7 = 0
            r8 = 1
            goto L_0x0053
        L_0x05d8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C97182r4.m125139b(android.content.Context, com.tencent.mm.storage.z1, java.util.List, boolean):com.tencent.wework.api.model.WWMediaMessage$WWMediaObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.wework.api.model.WWMediaMessage.WWMediaObject m125140c(com.tencent.p014mm.storage.C72996z1 r10, te3.C101834rc0 r11, com.tencent.p014mm.storage.C72963f4 r12, boolean r13) {
        /*
            int r0 = r11.f299258I
            r1 = 1
            if (r0 != r1) goto L_0x000d
            java.lang.String r10 = r11.f299301f
            com.tencent.wework.api.model.WWMediaText r11 = new com.tencent.wework.api.model.WWMediaText
            r11.<init>(r10)
            return r11
        L_0x000d:
            r2 = 2
            r3 = 0
            r4 = 0
            java.lang.String r5 = "MicroMsg.SendToWeWorkHelper"
            if (r0 != r2) goto L_0x0064
            long r12 = r12.getMsgId()
            boolean r10 = p206nj.C88955f.m111058b()
            if (r10 != 0) goto L_0x0020
        L_0x001e:
            r10 = r4
            goto L_0x0046
        L_0x0020:
            java.lang.String r10 = qg2.C101147j0.m132636q(r11, r12, r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r0 == 0) goto L_0x002e
            java.lang.String r10 = qg2.C101147j0.m132611D(r11, r12, r1)
        L_0x002e:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x003a
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r11 != 0) goto L_0x0046
        L_0x003a:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r3] = r10
            java.lang.String r10 = "MicroMsg.RecordMsgImgService"
            java.lang.String r12 = "getPath file not exist, path[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r12, r11)
            goto L_0x001e
        L_0x0046:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x0052
            java.lang.String r10 = "FAV_DATA_TYPE_IMG not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            return r4
        L_0x0052:
            com.tencent.wework.api.model.WWMediaImage r11 = new com.tencent.wework.api.model.WWMediaImage
            r11.<init>()
            r11.f285808g = r10
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r3] = r10
            java.lang.String r10 = "send img2, path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r12)
            return r11
        L_0x0064:
            r6 = 4
            if (r0 != r6) goto L_0x0094
            long r12 = r12.getMsgId()
            java.lang.String r10 = qg2.C101147j0.m132636q(r11, r12, r1)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x008e
            boolean r11 = rd3.C48020a.m53385b(r10)
            if (r11 != 0) goto L_0x007c
            goto L_0x008e
        L_0x007c:
            com.tencent.wework.api.model.WWMediaVideo r11 = new com.tencent.wework.api.model.WWMediaVideo
            r11.<init>()
            r11.f285808g = r10
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r3] = r10
            java.lang.String r10 = "send video2, path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r12)
            return r11
        L_0x008e:
            java.lang.String r10 = "FAV_DATA_TYPE_VIDEO not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            return r4
        L_0x0094:
            r7 = 6
            if (r0 != r7) goto L_0x00cd
            com.tencent.wework.api.model.WWMediaLocation r10 = new com.tencent.wework.api.model.WWMediaLocation
            r10.<init>()
            te3.sc0 r12 = r11.f299296c1
            if (r12 != 0) goto L_0x00a6
            java.lang.String r10 = "FAV_DATA_TYPE_LOC not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            return r4
        L_0x00a6:
            te3.zc0 r12 = r12.f299406e
            if (r12 != 0) goto L_0x00b7
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = r11.f299280T
            r10[r3] = r11
            java.lang.String r11 = "location error, locItem null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r11, r10)
            return r4
        L_0x00b7:
            java.lang.String r11 = r12.f299958o
            r10.f285818c = r11
            java.lang.String r11 = r12.f299956j
            r10.f285812f = r11
            double r0 = r12.f299950d
            r10.f285813g = r0
            double r0 = r12.f299952f
            r10.f285814h = r0
            int r11 = r12.f299954h
            double r11 = (double) r11
            r10.f285815i = r11
            return r10
        L_0x00cd:
            r8 = 8
            if (r0 != r8) goto L_0x010c
            long r12 = r12.getMsgId()
            java.lang.String r10 = qg2.C101147j0.m132636q(r11, r12, r1)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r12 == 0) goto L_0x00eb
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = r11.f299280T
            r10[r3] = r11
            java.lang.String r11 = "FAV_DATA_TYPE_FILE title == null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r11, r10)
            return r4
        L_0x00eb:
            long r12 = p645pj.C77092c.m93047i()
            long r0 = rd3.C48020a.m53386c(r10)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0106
            com.tencent.wework.api.model.WWMediaFile r0 = new com.tencent.wework.api.model.WWMediaFile
            r0.<init>()
            java.lang.String r11 = r11.f299297d
            r0.f285809h = r11
            r0.f285808g = r10
            int r10 = (int) r12
            r0.f285807f = r10
            return r0
        L_0x0106:
            com.tencent.mm.ui.chatting.r4$$g r10 = new com.tencent.mm.ui.chatting.r4$$g
            r10.<init>()
            throw r10
        L_0x010c:
            r8 = 17
            java.lang.String r9 = ""
            if (r0 != r8) goto L_0x01cb
            com.tencent.wework.api.model.WWMediaMergedConvs r0 = new com.tencent.wework.api.model.WWMediaMergedConvs
            r0.<init>()
            java.lang.String r11 = r11.f299326s1
            te3.dp3 r11 = qg2.C101147j0.m132643x(r11)
            if (r11 != 0) goto L_0x0121
            goto L_0x01ca
        L_0x0121:
            java.lang.String r1 = r11.f227153d
            r0.f285818c = r1
            java.util.LinkedList<te3.rc0> r11 = r11.f227155f
            java.util.Iterator r11 = r11.iterator()
        L_0x012b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x01ca
            java.lang.Object r1 = r11.next()
            te3.rc0 r1 = (te3.C101834rc0) r1
            com.tencent.wework.api.model.WWMediaConversation r2 = new com.tencent.wework.api.model.WWMediaConversation
            r2.<init>()
            java.lang.String r3 = r1.f299298d1
            java.lang.String r4 = r1.f299245B1
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0149
            r2.f285803f = r3
            goto L_0x015c
        L_0x0149:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = r1.f299245B1
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.f285803f = r3
        L_0x015c:
            te3.sc0 r3 = r1.f299296c1     // Catch:{ Exception -> 0x0190 }
            te3.tc0 r3 = r3.f299405d     // Catch:{ Exception -> 0x0190 }
            boolean r4 = r3.f299520g     // Catch:{ Exception -> 0x0190 }
            if (r4 == 0) goto L_0x0167
            java.lang.String r3 = r3.f299519f     // Catch:{ Exception -> 0x0190 }
            goto L_0x016f
        L_0x0167:
            boolean r4 = r3.f299526p     // Catch:{ Exception -> 0x0190 }
            if (r4 == 0) goto L_0x016e
            java.lang.String r3 = r3.f299525o     // Catch:{ Exception -> 0x0190 }
            goto L_0x016f
        L_0x016e:
            r3 = r9
        L_0x016f:
            java.lang.Class<ln.i> r4 = p196ln.C76708i.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x0190 }
            ln.i r4 = (p196ln.C76708i) r4     // Catch:{ Exception -> 0x0190 }
            android.graphics.Bitmap r3 = r4.N50(r3)     // Catch:{ Exception -> 0x0190 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0190 }
            r4.<init>()     // Catch:{ Exception -> 0x0190 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0190 }
            r6 = 50
            r3.compress(r5, r6, r4)     // Catch:{ Exception -> 0x0190 }
            byte[] r3 = r4.toByteArray()     // Catch:{ Exception -> 0x0190 }
            r2.f285805h = r3     // Catch:{ Exception -> 0x0190 }
            r4.close()     // Catch:{ Exception -> 0x0190 }
        L_0x0190:
            r3 = 0
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x01a5 }
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
            r5.<init>(r6)     // Catch:{ ParseException -> 0x01a5 }
            java.lang.String r6 = r1.f299302f1     // Catch:{ ParseException -> 0x01a5 }
            java.util.Date r5 = r5.parse(r6)     // Catch:{ ParseException -> 0x01a5 }
            long r5 = r5.getTime()     // Catch:{ ParseException -> 0x01a5 }
            goto L_0x01a7
        L_0x01a5:
            r5 = r3
        L_0x01a7:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x01bd
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x01bd }
            java.lang.String r4 = "yyyy-MM-dd HH:mm"
            r3.<init>(r4)     // Catch:{ ParseException -> 0x01bd }
            java.lang.String r4 = r1.f299302f1     // Catch:{ ParseException -> 0x01bd }
            java.util.Date r3 = r3.parse(r4)     // Catch:{ ParseException -> 0x01bd }
            long r5 = r3.getTime()     // Catch:{ ParseException -> 0x01bd }
        L_0x01bd:
            r2.f285804g = r5
            com.tencent.wework.api.model.WWMediaMessage$WWMediaObject r1 = m125140c(r10, r1, r12, r13)
            r2.f285806i = r1
            r0.mo136620g(r2)
            goto L_0x012b
        L_0x01ca:
            return r0
        L_0x01cb:
            r10 = 19
            if (r0 != r10) goto L_0x0210
            te3.sc0 r10 = r11.f299296c1
            te3.pc0 r10 = r10.f299420v
            com.tencent.wework.api.model.WWMediaMiniProgram r11 = new com.tencent.wework.api.model.WWMediaMiniProgram
            r11.<init>()
            java.lang.String r12 = r10.f259741d
            r11.f285821f = r12
            java.lang.String r13 = r10.f259746i
            r11.f285822g = r13
            java.lang.String r0 = r10.f259744g
            r11.f285824i = r0
            byte[] r4 = new byte[r1]
            r11.f285823h = r4
            java.lang.String r4 = r10.f259747j
            r11.f285825j = r4
            r11.f285818c = r9
            int r10 = r10.f259745h
            r11.f285826k = r10
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r3] = r12
            r10[r1] = r13
            r10[r2] = r0
            r12 = 3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r10[r12] = r13
            java.lang.String r12 = r11.f285825j
            r10[r6] = r12
            r12 = 5
            java.lang.String r13 = r11.f285818c
            r10[r12] = r13
            java.lang.String r12 = "WWMediaMiniProgram[username:%s path:%s iconUrl:%s hdImageData:%s name:%s title:%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r12, r10)
            return r11
        L_0x0210:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10[r3] = r11
            java.lang.String r11 = "unsupport msg type: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C97182r4.m125140c(com.tencent.mm.storage.z1, te3.rc0, com.tencent.mm.storage.f4, boolean):com.tencent.wework.api.model.WWMediaMessage$WWMediaObject");
    }

    /* renamed from: d */
    public static boolean m125141d(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d = WWAPIFactory.m125312a(context).mo136606d();
        Log.m105925i("MicroMsg.SendToWeWorkHelper", "isSupportMultiMsgForward:%s costTime:%s", Boolean.valueOf(d), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return d;
    }

    /* renamed from: e */
    public static void m125142e(Context context, BaseDataToWeWork baseDataToWeWork, IWWAPI.WWAppType wWAppType) {
        if (baseDataToWeWork != null && (baseDataToWeWork instanceof FileData)) {
            FileData fileData = (FileData) baseDataToWeWork;
            String str = fileData.f249805d;
            long longValue = fileData.f249806e.longValue();
            String str2 = fileData.f249807f;
            Log.m105924i("MicroMsg.SendToWeWorkHelper", "sendFileToWeWork() called with: context = [" + context + "], filePath = [" + str + "], fileSize = [" + longValue + "], title = [" + str2 + "], appType = [" + wWAppType + "]");
            long i = C77092c.m93047i();
            if (longValue <= i) {
                WWMediaFile wWMediaFile = new WWMediaFile();
                wWMediaFile.f285809h = str2;
                wWMediaFile.f285808g = str;
                wWMediaFile.f285807f = (int) i;
                WWAPIFactory.m125312a(context).mo136603a(wWMediaFile, wWAppType);
                return;
            }
            throw new r4$$g();
        }
    }

    /* renamed from: f */
    public static void m125143f(Context context, String str, IWWAPI.WWAppType wWAppType) {
        Log.m105924i("MicroMsg.SendToWeWorkHelper", "sendTextToWeWork() called with: context = [" + context + "], textContent = [" + str + "], appType = [" + wWAppType + "]");
        WWAPIFactory.m125312a(context).mo136603a(new WWMediaText(str), wWAppType);
    }

    /* renamed from: g */
    public static void m125144g(Context context, String str, IWWAPI.WWAppType wWAppType) {
        Log.m105924i("MicroMsg.SendToWeWorkHelper", "sendVideoToWeWork() called with: context = [" + context + "], filePath = [" + str + "], appType = [" + wWAppType + "]");
        WWMediaVideo wWMediaVideo = new WWMediaVideo();
        wWMediaVideo.f285808g = str;
        WWAPIFactory.m125312a(context).mo136603a(wWMediaVideo, wWAppType);
    }

    /* renamed from: h */
    public static boolean m125145h(Context context, C72996z1 z1Var, List<C72963f4> list, boolean z, IWWAPI.WWAppType wWAppType, int i) {
        Context context2 = context;
        if (list == null || list.size() == 0) {
            return false;
        }
        if (C74343y0.m88778v(list)) {
            Log.m105928w("MicroMsg.SendToWeWorkHelper", "isContainPlaceHolderMsg");
            C76879j.m92754y(context, context.getString(C0966R.string.lro), "", context.getString(C0966R.string.f7263q), new r4$$c());
            return false;
        } else if (C74343y0.m88781y(list)) {
            Log.m105928w("MicroMsg.SendToWeWorkHelper", "isContainUndownloadFile");
            C76879j.m92750u(context, context.getString(C0966R.string.buy), "", new r4$$d(), (DialogInterface.OnClickListener) null);
            return false;
        } else {
            for (C72963f4 a : list) {
                if (!C73764n3.m87369a(a)) {
                    C76879j.m92754y(context, context.getString(C0966R.string.cm7), "", context.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                    return false;
                }
            }
            if (!C74343y0.m88763g(true, list, z1Var.getUsername(), (C77632o) null)) {
                Log.m105928w("MicroMsg.SendToWeWorkHelper", "handleInvalidSendToFriendMsg");
                String string = context.getString(C0966R.string.frj);
                String string2 = context.getString(C0966R.string.i48);
                String string3 = context.getString(C0966R.string.f7926wf);
                C76879j.m92707A(context, string, "", string2, string3, new r4$$e(context, z1Var, list, z, wWAppType, i), new r4$$f());
                return true;
            }
            m125138a(context, z1Var, list, z, wWAppType, i);
            return true;
        }
    }
}
