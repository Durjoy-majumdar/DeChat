package com.tencent.p014mm.plugin.sns.p106ui.album;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.sns.data.SnsCmdList;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.album.C95716a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import it2.C46285b;
import it2.C46286c;
import it2.C98795d;
import it2.C98796e;
import java.util.ArrayList;
import java.util.List;
import jr2.C76440q;
import jr2.C99014h;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI */
public class SnsAlbumUI extends MMFragment implements C76440q.C76441a, C95716a.C95718b {

    /* renamed from: r */
    public static final /* synthetic */ int f279150r = 0;

    /* renamed from: d */
    public RecyclerView f279151d = null;

    /* renamed from: e */
    public LinearLayout f279152e = null;

    /* renamed from: f */
    public LinearLayout f279153f = null;

    /* renamed from: g */
    public C95716a f279154g = null;

    /* renamed from: h */
    public String f279155h = null;

    /* renamed from: i */
    public String f279156i = null;

    /* renamed from: j */
    public int f279157j = 0;

    /* renamed from: n */
    public boolean f279158n = false;

    /* renamed from: o */
    public C5431p1.C5432a f279159o = null;

    /* renamed from: p */
    public int f279160p = 0;

    /* renamed from: q */
    public Runnable f279161q = new C95715a();

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$a */
    public class C95715a implements Runnable {
        public C95715a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$1");
            SnsAlbumUI snsAlbumUI = SnsAlbumUI.this;
            int i = SnsAlbumUI.f279150r;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            C95716a aVar = snsAlbumUI.f279154g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            if (aVar != null) {
                SnsAlbumUI snsAlbumUI2 = SnsAlbumUI.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                C95716a aVar2 = snsAlbumUI2.f279154g;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                aVar2.mo133167O4();
                SnsAlbumUI snsAlbumUI3 = SnsAlbumUI.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                C95716a aVar3 = snsAlbumUI3.f279154g;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                aVar3.mo133168g5("");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$1");
        }
    }

    /* renamed from: K */
    public static /* synthetic */ String m122527K(SnsAlbumUI snsAlbumUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        String str = snsAlbumUI.f279156i;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        if (r6 != false) goto L_0x00e2;
     */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo96527B0(java.lang.String r24, boolean r25, int r26, jr2.C99014h r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "onFpSetSize"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r5 = r27.mo131175t0()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            boolean r5 = r27.mo131176w()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "needLoopFetch"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            int r8 = r0.f279160p
            r9 = 2
            if (r8 >= r9) goto L_0x0032
            r8 = 1
            goto L_0x0033
        L_0x0032:
            r8 = 0
        L_0x0033:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4[r9] = r8
            com.tencent.mm.plugin.sns.ui.album.a r8 = r0.f279154g
            r8.getClass()
            java.lang.String r10 = "getLimtiSeq"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r8 = r8.f279166g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r12 = 3
            r4[r12] = r8
            java.lang.String r8 = "MicroMsg.SnsAlbumUI"
            java.lang.String r12 = "onFpSetSize, isDownAll:%s, isNeedGetNextPage:%s, needLoopFetch:%s， getLimtiSeq:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r4)
            java.lang.String r4 = r0.f279155h
            java.lang.String r12 = r0.f279156i
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x00a5
            long r12 = r27.mo131174p0()
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x00a5
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC
            long r16 = r27.mo131174p0()
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            r4.mo119677K(r12, r13)
            com.tencent.mm.plugin.sns.ui.album.a r4 = r0.f279154g
            long r12 = r27.mo131174p0()
            r4.getClass()
            java.lang.String r6 = "setRecentLimitedID"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r11)
            r16 = r10
            long r9 = r4.f279170n
            int r17 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r17 == 0) goto L_0x009f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            goto L_0x00a7
        L_0x009f:
            r4.f279170n = r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            goto L_0x00a7
        L_0x00a5:
            r16 = r10
        L_0x00a7:
            boolean r4 = r27.mo131175t0()
            if (r4 == 0) goto L_0x00cc
            com.tencent.mm.plugin.sns.ui.album.a r4 = r0.f279154g
            java.lang.String r5 = r27.mo131161C()
            r4.getClass()
            java.lang.String r6 = "onIsAll"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r11)
            java.lang.String r9 = "MicroMsg.SnsAlbumAdapter"
            java.lang.String r10 = "snsactivty onIsDownAll "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
            r4.f279172p = r7
            r4.f279173q = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            goto L_0x00fc
        L_0x00cc:
            boolean r4 = r27.mo131176w()
            if (r4 != 0) goto L_0x00e2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            int r4 = r0.f279160p
            r6 = 2
            if (r4 >= r6) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            if (r6 == 0) goto L_0x00fc
        L_0x00e2:
            int r4 = r0.f279160p
            int r4 = r4 + r7
            r0.f279160p = r4
            com.tencent.mm.plugin.sns.model.p1$a r4 = r0.f279159o
            r18 = 10
            java.lang.String r5 = r0.f279156i
            r20 = 0
            r21 = 1
            int r6 = r0.f279157j
            r17 = r4
            r19 = r5
            r22 = r6
            r17.mo6414e(r18, r19, r20, r21, r22)
        L_0x00fc:
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_album_fp_callback_refresh_switch
            boolean r4 = r4.mo58784wf(r5, r7)
            java.lang.String r5 = ""
            java.lang.String r6 = "onFpSetSize onNotifyChange"
            java.lang.String r7 = "setRespMinSeq"
            if (r4 != 0) goto L_0x0147
            com.tencent.mm.plugin.sns.ui.album.a r9 = r0.f279154g
            r9.getClass()
            r10 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r9 = r9.f279166g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0147
            com.tencent.mm.plugin.sns.ui.album.a r9 = r0.f279154g
            if (r9 == 0) goto L_0x0147
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            com.tencent.mm.plugin.sns.ui.album.a r9 = r0.f279154g
            r9.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)
            r9.f279165f = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            com.tencent.mm.plugin.sns.ui.album.a r9 = r0.f279154g
            r9.mo133167O4()
            com.tencent.mm.plugin.sns.ui.album.a r9 = r0.f279154g
            r9.mo133168g5(r5)
        L_0x0147:
            if (r4 == 0) goto L_0x0167
            com.tencent.mm.plugin.sns.ui.album.a r4 = r0.f279154g
            if (r4 == 0) goto L_0x0167
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            com.tencent.mm.plugin.sns.ui.album.a r4 = r0.f279154g
            r4.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)
            r4.f279165f = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            com.tencent.mm.plugin.sns.ui.album.a r1 = r0.f279154g
            r1.mo133167O4()
            com.tencent.mm.plugin.sns.ui.album.a r1 = r0.f279154g
            r1.mo133168g5(r5)
        L_0x0167:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.album.SnsAlbumUI.mo96527B0(java.lang.String, boolean, int, jr2.h):void");
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        C94866e1.ly0().removeCallbacks(this.f279161q);
        if (this.f279155h.equals(this.f279156i) && hVar.mo131174p0() != 0) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, Long.valueOf(hVar.mo131174p0()));
            C95716a aVar = this.f279154g;
            long p0 = hVar.mo131174p0();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (0 != aVar.f279170n) {
                SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            } else {
                aVar.f279170n = p0;
                SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            }
        }
        if (hVar.mo131175t0()) {
            C95716a aVar2 = this.f279154g;
            String C = hVar.mo131161C();
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("onIsAll", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            Log.m105918d("MicroMsg.SnsAlbumAdapter", "snsactivty onIsDownAll ");
            aVar2.f279172p = true;
            aVar2.f279173q = C;
            SnsMethodCalculate.markEndTimeMs("onIsAll", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (this.f279154g.getItemCount() > 0) {
                C95716a aVar3 = this.f279154g;
                aVar3.notifyItemChanged(aVar3.getItemCount() - 1);
            }
        } else {
            C95716a aVar4 = this.f279154g;
            if (aVar4 != null) {
                boolean D0 = hVar.mo131163D0();
                SnsMethodCalculate.markStartTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                aVar4.f279169j = D0;
                SnsMethodCalculate.markEndTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                C95716a aVar5 = this.f279154g;
                aVar5.getClass();
                SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                aVar5.f279165f = str;
                SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                this.f279154g.mo133167O4();
                this.f279154g.mo133168g5("");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public void dealContentView(View view) {
        SnsMethodCalculate.markStartTimeMs("dealContentView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.dealContentView(view);
        SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        this.f279159o = C94866e1.dy0();
        this.f279157j = getActivity().getIntent().getIntExtra("sns_source", 0);
        this.f279156i = getActivity().getIntent().getStringExtra("sns_userName");
        this.f279155h = C75592q0.m90789s();
        C95716a aVar = new C95716a(getContext(), this.f279156i, this);
        this.f279154g = aVar;
        C95732d dVar = new C95732d(this);
        SnsMethodCalculate.markStartTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        aVar.f279175s = dVar;
        SnsMethodCalculate.markEndTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        this.f279152e = (LinearLayout) view.findViewById(C0966R.C0970id.f5751nm);
        this.f279153f = (LinearLayout) view.findViewById(C0966R.C0970id.f5750nl);
        this.f279151d = (RecyclerView) view.findViewById(C0966R.C0970id.f5753no);
        this.f279153f.setOnClickListener(new C46286c(this));
        this.f279151d.setAdapter(this.f279154g);
        this.f279151d.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f279151d.mo17043c(new C98795d(this));
        this.f279151d.postDelayed(new C98796e(this), 500);
        SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        SnsMethodCalculate.markEndTimeMs("dealContentView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        return C0966R.C0971layout.c26;
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onActivityResult(i, i2, intent);
        Log.m105919d("MicroMsg.SnsAlbumUI", "onActivityResult result=%s request=%s intent=%s", Integer.valueOf(i2), Integer.valueOf(i), intent2);
        if (i == 8 && intent2 != null && intent2.getParcelableExtra("sns_cmd_list") != null && (intent2.getParcelableExtra("sns_cmd_list") instanceof SnsCmdList)) {
            SnsCmdList snsCmdList = (SnsCmdList) intent2.getParcelableExtra("sns_cmd_list");
            snsCmdList.getClass();
            SnsMethodCalculate.markStartTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            List<Integer> list = snsCmdList.f274672f;
            SnsMethodCalculate.markEndTimeMs("getRemoves", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                C95716a aVar = this.f279154g;
                RecyclerView recyclerView = this.f279151d;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                SnsMethodCalculate.markStartTimeMs("findAdapterPositionByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                int i3 = 0;
                while (true) {
                    if (i3 >= ((ArrayList) aVar.f279163d).size()) {
                        SnsMethodCalculate.markEndTimeMs("findAdapterPositionByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                        i3 = -1;
                        break;
                    }
                    for (SnsInfo snsInfo : ((C95716a.C95719c) ((ArrayList) aVar.f279163d).get(i3)).f279178a) {
                        if (intValue2 == snsInfo.localid) {
                            SnsMethodCalculate.markEndTimeMs("findAdapterPositionByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            break;
                        }
                    }
                    i3++;
                }
                if (i3 != -1) {
                    RecyclerView.C16631z I0 = recyclerView.mo17023I0(i3);
                    if (I0 instanceof C95716a.C95724g) {
                        int i4 = C95716a.C95724g.f279186F;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
                        C95727c cVar = ((C95716a.C95724g) I0).f279192z;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
                        cVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                        int i5 = 1;
                        int i6 = -1;
                        for (int i7 = 0; i7 < ((ArrayList) cVar.f279199d).size(); i7++) {
                            if (((C95716a.C95721e) ((ArrayList) cVar.f279199d).get(i7)).f279182a == intValue2) {
                                if (i6 == -1) {
                                    i6 = i7;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        int i8 = 0;
                        if (i6 != -1) {
                            while (i8 < i5) {
                                ((ArrayList) cVar.f279199d).remove(i6);
                                i8++;
                            }
                            i8 = ((ArrayList) cVar.f279199d).size();
                            cVar.notifyItemRangeRemoved(i6, i5);
                        }
                        SnsMethodCalculate.markEndTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                        if (i8 <= 0) {
                            ((ArrayList) aVar.f279163d).remove(i3);
                            aVar.notifyItemRemoved(i3);
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("notifyDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        C85875k4.m106195m0(getActivity());
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        setMMTitle((int) C0966R.string.f7545j9);
        setBackBtn(new C46285b(this));
        SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public void onDestroy() {
        C5431p1.C5432a aVar;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        super.onDestroy();
        this.f279158n = true;
        C94866e1.dy0().mo6411b(this.f279156i);
        C94866e1.ly0().removeCallbacks(this.f279161q);
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l() && (aVar = this.f279159o) != null) {
            aVar.mo6412c(this, 10);
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public void onViewCreated(View view, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onViewCreated", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        Log.m105918d("MicroMsg.SnsAlbumUI", "onViewCreated");
        super.onViewCreated(view, bundle);
        SnsMethodCalculate.markEndTimeMs("onViewCreated", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
    }

    public boolean supportNavigationSwipeBack() {
        SnsMethodCalculate.markStartTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        SnsMethodCalculate.markEndTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        return false;
    }
}
