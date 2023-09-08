package ve1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0714b2;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import up1.C37521f;

/* renamed from: ve1.o7 */
public final class C14588o7 extends C60896i<C0714b2> {

    /* renamed from: e */
    public boolean f40412e;

    /* renamed from: f */
    public final boolean f40413f;

    public C14588o7() {
        C37521f.f99374d.getClass();
        this.f40413f = C37521f.f99381d7.mo60266n().intValue() != 1 ? false : true;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ao8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0146  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r23, jq3.C9493c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            r22 = this;
            r6 = r22
            r7 = r23
            r0 = r25
            r8 = r24
            cm1.b2 r8 = (cm1.C0714b2) r8
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r8, r1)
            te3.td1 r9 = r8.f1712e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFinderObject()
            long r1 = r1.f164794id
            java.lang.String r10 = o40.C61926c.m72691p(r1)
            r1 = 2131311451(0x7f093b5b, float:1.8241243E38)
            android.view.View r1 = r7.mo85812D(r1)
            r11 = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r11
            if (r28 == 0) goto L_0x0039
            boolean r1 = r28.isEmpty()
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            java.lang.String r14 = "holder.context"
            java.lang.String r2 = "Finder.ProfileQQMusicConvert"
            r15 = 2131755663(0x7f10028f, float:1.9142212E38)
            r12 = 2131755657(0x7f100289, float:1.91422E38)
            r13 = 2131101269(0x7f060655, float:1.7814943E38)
            if (r1 != 0) goto L_0x0156
            java.util.Iterator r1 = r28.iterator()
        L_0x004d:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0153
            java.lang.Object r9 = r1.next()
            boolean r4 = r9 instanceof rx3.C13604l
            if (r4 == 0) goto L_0x014e
            rx3.l r9 = (rx3.C13604l) r9
            A r4 = r9.f38555d
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = 21
            java.lang.String r3 = "  isTheSameIdPlaying:"
            java.lang.String r5 = "payloadsMusicPause :"
            if (r4 == r9) goto L_0x00fe
            r9 = 22
            if (r4 == r9) goto L_0x00ae
            r3 = 33
            if (r4 == r3) goto L_0x0077
            goto L_0x014e
        L_0x0077:
            android.content.Context r3 = r7.f173499A
            gy3.C87412m.m108593f(r3, r14)
            boolean r4 = r8.f1715h
            if (r4 == 0) goto L_0x0094
            if (r11 == 0) goto L_0x0085
            r11.setImageResource(r12)
        L_0x0085:
            if (r11 != 0) goto L_0x0088
            goto L_0x009b
        L_0x0088:
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r13)
            r11.setIconColor(r3)
            goto L_0x009b
        L_0x0094:
            if (r11 == 0) goto L_0x0099
            r11.setImageResource(r15)
        L_0x0099:
            if (r11 != 0) goto L_0x009f
        L_0x009b:
            r4 = 2131099804(0x7f06009c, float:1.7811972E38)
            goto L_0x004d
        L_0x009f:
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r3 = r3.getColor(r4)
            r11.setIconColor(r3)
            goto L_0x004d
        L_0x00ae:
            r4 = 2131099804(0x7f06009c, float:1.7811972E38)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r0)
            r9.append(r3)
            qc0.m r3 = qc0.C101093a.m132480b()
            if (r3 == 0) goto L_0x00c8
            java.lang.String r5 = r3.f295960e
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            if (r5 == 0) goto L_0x00e0
            int r5 = r3.f295959d
            if (r5 != 0) goto L_0x00e0
            boolean r5 = qc0.C101093a.m132481c()
            if (r5 == 0) goto L_0x00e0
            java.lang.String r3 = r3.f295960e     // Catch:{ Exception -> 0x00df }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r10)     // Catch:{ Exception -> 0x00df }
            if (r3 == 0) goto L_0x00e0
            r3 = 1
            goto L_0x00e1
        L_0x00df:
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r3 = 2131311450(0x7f093b5a, float:1.824124E38)
            android.view.View r5 = r7.mo85812D(r3)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x004d
            r3 = 2131756957(0x7f10079d, float:1.9144836E38)
            r5.setImageResource(r3)
            goto L_0x004d
        L_0x00fe:
            r4 = 2131099804(0x7f06009c, float:1.7811972E38)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r0)
            r9.append(r3)
            qc0.m r3 = qc0.C101093a.m132480b()
            if (r3 == 0) goto L_0x0118
            java.lang.String r5 = r3.f295960e
            goto L_0x0119
        L_0x0118:
            r5 = 0
        L_0x0119:
            if (r5 == 0) goto L_0x0130
            int r5 = r3.f295959d
            if (r5 != 0) goto L_0x0130
            boolean r5 = qc0.C101093a.m132481c()
            if (r5 == 0) goto L_0x0130
            java.lang.String r3 = r3.f295960e     // Catch:{ Exception -> 0x012f }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r10)     // Catch:{ Exception -> 0x012f }
            if (r3 == 0) goto L_0x0130
            r3 = 1
            goto L_0x0131
        L_0x012f:
        L_0x0130:
            r3 = 0
        L_0x0131:
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r3 = 2131311450(0x7f093b5a, float:1.824124E38)
            android.view.View r5 = r7.mo85812D(r3)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x004d
            r9 = 2131756956(0x7f10079c, float:1.9144834E38)
            r5.setImageResource(r9)
            goto L_0x004d
        L_0x014e:
            r3 = 2131311450(0x7f093b5a, float:1.824124E38)
            goto L_0x009b
        L_0x0153:
            r0 = r6
            goto L_0x04c0
        L_0x0156:
            r3 = 2131311450(0x7f093b5a, float:1.824124E38)
            r4 = 2131099804(0x7f06009c, float:1.7811972E38)
            android.view.View r0 = r7.mo85812D(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = 2131311449(0x7f093b59, float:1.8241239E38)
            android.view.View r1 = r7.mo85812D(r1)
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r3 = 2131311452(0x7f093b5c, float:1.8241245E38)
            android.view.View r1 = r7.mo85812D(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2131311446(0x7f093b56, float:1.8241233E38)
            android.view.View r3 = r7.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r15 = 2131311448(0x7f093b58, float:1.8241237E38)
            android.view.View r17 = r7.mo85812D(r15)
            r13 = r17
            android.widget.TextView r13 = (android.widget.TextView) r13
            r12 = 2131311444(0x7f093b54, float:1.8241228E38)
            android.view.View r18 = r7.mo85812D(r12)
            r12 = r18
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r18 = ""
            if (r9 == 0) goto L_0x0201
            java.lang.String r4 = r9.f185536f
            r1.setText(r4)
            er1.w3 r4 = er1.C58784w3.f168295a
            int r15 = r9.f185543p
            java.lang.String r4 = r4.mo83867F(r15)
            r3.setText(r4)
            java.lang.String r3 = r9.f185537g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = r9.f185538h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x01d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.f185537g
            r3.append(r4)
            java.lang.String r4 = " · "
            r3.append(r4)
            java.lang.String r4 = r9.f185538h
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x01f1
        L_0x01d1:
            java.lang.String r3 = r9.f185537g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x01e0
            java.lang.String r3 = r9.f185537g
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x01f1
        L_0x01e0:
            java.lang.String r3 = r9.f185538h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x01ef
            java.lang.String r3 = r9.f185538h
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x01f1
        L_0x01ef:
            r3 = r18
        L_0x01f1:
            r13.setText(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x01fd
            r3 = 8
            goto L_0x01fe
        L_0x01fd:
            r3 = 0
        L_0x01fe:
            r13.setVisibility(r3)
        L_0x0201:
            if (r9 == 0) goto L_0x0206
            java.lang.String r3 = r9.f185535e
            goto L_0x0207
        L_0x0206:
            r3 = 0
        L_0x0207:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "onBindViewHolder imageUrl: "
            r4.append(r15)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            if (r27 != 0) goto L_0x026b
            r2 = 2131304667(0x7f0920db, float:1.8227483E38)
            android.view.View r2 = r7.mo85812D(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r4 = 2131232388(0x7f080684, float:1.8080884E38)
            r2.setImageResource(r4)
            if (r3 != 0) goto L_0x0230
            r3 = r18
        L_0x0230:
            java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            boolean r19 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r19 != 0) goto L_0x026b
            r19 = r1
            bl3.r r1 = bl3.C39818r.f106831a
            r20 = r5
            bl3.r$a r5 = r1.mo62446e(r15)
            bl3.c r5 = r5.mo62447c(r4)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            r21 = r11
            pl1.n0 r11 = new pl1.n0
            up1.y r6 = up1.C27696y.THUMB_IMAGE
            r11.<init>(r3, r6)
            pl1.e0$a r3 = pl1.C11978e0.C11979a.MSG_THUMB
            bl3.r$a r1 = r1.mo62446e(r15)
            bl3.c r1 = r1.mo62447c(r4)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r3)
            r5.mo85957c(r11, r2, r1)
            goto L_0x0271
        L_0x026b:
            r19 = r1
            r20 = r5
            r21 = r11
        L_0x0271:
            qc0.m r1 = qc0.C101093a.m132480b()
            if (r1 == 0) goto L_0x027a
            java.lang.String r2 = r1.f295960e
            goto L_0x027b
        L_0x027a:
            r2 = 0
        L_0x027b:
            if (r2 == 0) goto L_0x0292
            int r2 = r1.f295959d
            if (r2 != 0) goto L_0x0292
            boolean r2 = qc0.C101093a.m132481c()
            if (r2 == 0) goto L_0x0292
            java.lang.String r1 = r1.f295960e     // Catch:{ Exception -> 0x0291 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r10)     // Catch:{ Exception -> 0x0291 }
            if (r1 == 0) goto L_0x0292
            r1 = 1
            goto L_0x0293
        L_0x0291:
        L_0x0292:
            r1 = 0
        L_0x0293:
            if (r1 == 0) goto L_0x029c
            r1 = 2131756956(0x7f10079c, float:1.9144834E38)
            r0.setImageResource(r1)
            goto L_0x02a2
        L_0x029c:
            r1 = 2131756957(0x7f10079d, float:1.9144836E38)
            r0.setImageResource(r1)
        L_0x02a2:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.f1711d
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x02b8
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x02b8
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            r3 = r0
            com.tencent.mm.protocal.protobuf.FinderMedia r3 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r3
            goto L_0x02b9
        L_0x02b8:
            r3 = 0
        L_0x02b9:
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            if (r3 == 0) goto L_0x02d4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.thumbUrl
            r0.append(r1)
            java.lang.String r1 = r3.thumb_url_token
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x02d6
        L_0x02d4:
            r0 = r18
        L_0x02d6:
            r5.f27484d = r0
            if (r0 == 0) goto L_0x02e3
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02e1
            goto L_0x02e3
        L_0x02e1:
            r0 = 0
            goto L_0x02e4
        L_0x02e3:
            r0 = 1
        L_0x02e4:
            if (r0 == 0) goto L_0x02f0
            if (r9 == 0) goto L_0x02f0
            java.lang.String r0 = r9.f185535e
            if (r0 != 0) goto L_0x02ee
            r0 = r18
        L_0x02ee:
            r5.f27484d = r0
        L_0x02f0:
            ve1.l7 r6 = new ve1.l7
            r0 = r6
            r11 = r19
            r1 = r9
            r2 = r8
            r15 = 2131311452(0x7f093b5c, float:1.8241245E38)
            r3 = r23
            r16 = 2131099804(0x7f06009c, float:1.7811972E38)
            r4 = r22
            r15 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r15.setOnClickListener(r6)
            if (r9 == 0) goto L_0x0312
            java.lang.String r0 = r9.f185534d
            if (r0 != 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r4 = r0
            goto L_0x0314
        L_0x0312:
            r4 = r18
        L_0x0314:
            android.view.View r6 = r7.f44854d
            java.lang.String r0 = "holder.itemView"
            gy3.C87412m.m108593f(r6, r0)
            ve1.m7 r15 = new ve1.m7
            r0 = r15
            r1 = r23
            r2 = r10
            r3 = r22
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            zp3.C23564m.m28138h(r6, r15)
            r0 = 2131311443(0x7f093b53, float:1.8241226E38)
            android.view.View r1 = r7.mo85812D(r0)
            if (r1 == 0) goto L_0x0347
            r2 = 2131302587(0x7f0918bb, float:1.8223264E38)
            java.lang.CharSequence r3 = r11.getText()
            r1.setTag(r2, r3)
            r2 = 2131302513(0x7f091871, float:1.8223114E38)
            java.lang.CharSequence r3 = r13.getText()
            r1.setTag(r2, r3)
        L_0x0347:
            te3.vd1 r1 = r8.f1713f
            if (r1 == 0) goto L_0x0374
            long r2 = r1.f143437d
            int r3 = (int) r2
            long r2 = (long) r3
            java.lang.String r2 = er1.C7878t0.m8036e(r2)
            long r3 = r1.f143438e
            int r1 = (int) r3
            long r3 = (long) r1
            java.lang.String r1 = er1.C7878t0.m8036e(r3)
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131829690(0x7f1123ba, float:1.9292356E38)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r2
            r2 = 1
            r5[r2] = r1
            java.lang.String r1 = r3.getString(r4, r5)
            r12.setText(r1)
        L_0x0374:
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r7.f173499A
            gy3.C87412m.m108593f(r2, r14)
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC> r2 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC r1 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) r1
            boolean r1 = r1.mo3861i0()
            r2 = 2131311445(0x7f093b55, float:1.824123E38)
            if (r1 == 0) goto L_0x03ff
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 == 0) goto L_0x039c
            r1 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r0.setBackgroundResource(r1)
        L_0x039c:
            r0 = 2131311452(0x7f093b5c, float:1.8241245E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x03b7
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099704(0x7f060038, float:1.7811769E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x03b7:
            r0 = 2131311448(0x7f093b58, float:1.8241237E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x03d2
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099699(0x7f060033, float:1.7811759E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x03d2:
            r0 = 2131311444(0x7f093b54, float:1.8241228E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x03ed
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099697(0x7f060031, float:1.7811755E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x03ed:
            android.view.View r0 = r7.mo85812D(r2)
            if (r0 == 0) goto L_0x03f9
            r1 = 2131099690(0x7f06002a, float:1.781174E38)
            r0.setBackgroundResource(r1)
        L_0x03f9:
            r0 = r22
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
            goto L_0x046e
        L_0x03ff:
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 == 0) goto L_0x040b
            r1 = 2131101833(0x7f060889, float:1.7816087E38)
            r0.setBackgroundResource(r1)
        L_0x040b:
            r0 = 2131311452(0x7f093b5c, float:1.8241245E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0426
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x0426:
            r0 = 2131311448(0x7f093b58, float:1.8241237E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0442
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            goto L_0x0445
        L_0x0442:
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
        L_0x0445:
            r0 = 2131311444(0x7f093b54, float:1.8241228E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0460
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
        L_0x0460:
            android.view.View r0 = r7.mo85812D(r2)
            if (r0 == 0) goto L_0x046c
            r1 = 2131099808(0x7f0600a0, float:1.781198E38)
            r0.setBackgroundResource(r1)
        L_0x046c:
            r0 = r22
        L_0x046e:
            boolean r1 = r0.f40413f
            if (r1 == 0) goto L_0x04b9
            boolean r1 = r0.f40412e
            if (r1 != 0) goto L_0x04b9
            int r1 = r8.f1714g
            if (r1 != 0) goto L_0x047b
            goto L_0x04b9
        L_0x047b:
            r1 = r21
            r2 = 0
            r1.setVisibility(r2)
            android.content.Context r2 = r7.f173499A
            gy3.C87412m.m108593f(r2, r14)
            boolean r4 = r8.f1715h
            if (r4 == 0) goto L_0x049f
            r4 = 2131755657(0x7f100289, float:1.91422E38)
            r1.setImageResource(r4)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101269(0x7f060655, float:1.7814943E38)
            int r2 = r2.getColor(r3)
            r1.setIconColor(r2)
            goto L_0x04b0
        L_0x049f:
            r4 = 2131755663(0x7f10028f, float:1.9142212E38)
            r1.setImageResource(r4)
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r1.setIconColor(r2)
        L_0x04b0:
            ve1.n7 r2 = new ve1.n7
            r2.<init>(r8, r7, r1, r9)
            r1.setOnClickListener(r2)
            goto L_0x04c0
        L_0x04b9:
            r1 = r21
            r2 = 8
            r1.setVisibility(r2)
        L_0x04c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14588o7.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
