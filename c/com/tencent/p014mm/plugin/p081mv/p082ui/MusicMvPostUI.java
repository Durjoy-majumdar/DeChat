package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C58741j5;
import er1.C58784w3;
import f12.C7970a;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ht1.C60216z4;
import ic0.C21070h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import jc0.C21210b;
import kotlin.Metadata;
import lb2.C61269a;
import lb2.C61270b;
import lb2.C61271c;
import lb2.C61272d;
import lb2.C61275h;
import nj3.C88989a;
import p274xx.C38874h;
import p823sg.C90193h;
import qo3.C77407n;
import rx3.C13598b0;
import sb2.C63845s0;
import sx3.C22415w0;
import sx3.C48501y0;
import te3.C64621p23;
import z04.C119027c;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvPostUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(33)
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI */
public final class MusicMvPostUI extends BaseMusicMvUI {

    /* renamed from: n */
    public static final /* synthetic */ int f163088n = 0;

    /* renamed from: e */
    public C64621p23 f163089e;

    /* renamed from: f */
    public C58969q f163090f;

    /* renamed from: g */
    public String f163091g;

    /* renamed from: h */
    public String f163092h;

    /* renamed from: i */
    public boolean f163093i;

    /* renamed from: j */
    public boolean f163094j;

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI$a */
    public static final class C56938a extends C87413o implements C32226l<C64621p23, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvPostUI f163095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56938a(MusicMvPostUI musicMvPostUI) {
            super(1);
            this.f163095d = musicMvPostUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0114  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                te3.p23 r1 = (te3.C64621p23) r1
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                java.lang.String r3 = "it"
                gy3.C87412m.m108594g(r1, r3)
                long r3 = r1.f184743h
                java.lang.String r5 = "MicroMsg.Mv.MusicMvPostUI"
                r6 = 0
                int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x004e
                di3.d r3 = di3.C86312j.m106911c(r2)
                com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
                wp1.b r3 = r3.Cx0()
                long r8 = r1.f184743h
                up1.l r3 = r3.mo90229qq(r8)
                if (r3 == 0) goto L_0x004e
                long r8 = r3.field_objectId
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 == 0) goto L_0x0047
                di3.d r2 = di3.C86312j.m106911c(r2)
                com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
                wp1.b r2 = r2.Cx0()
                long r8 = r1.f184743h
                r2.mo90227bD(r8)
                long r2 = r3.field_objectId
                java.lang.String r4 = "post svr draft"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                goto L_0x004f
            L_0x0047:
                up1.m r2 = up1.C65420m.f188268a
                long r3 = r1.f184743h
                r2.mo89519a(r3)
            L_0x004e:
                r2 = r6
            L_0x004f:
                java.lang.Class<lr.b> r4 = p599lr.C61381b.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                lr.b r4 = (p599lr.C61381b) r4
                qo1.g r4 = r4.mo78545UQ()
                long r2 = r4.mo12410c(r1, r2)
                r1.f184743h = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "postData localId"
                r2.append(r3)
                long r3 = r1.f184743h
                r2.append(r3)
                java.lang.String r3 = " coverLocalPath:"
                r2.append(r3)
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r3 = r0.f163095d
                te3.p23 r3 = r3.f163089e
                if (r3 == 0) goto L_0x007f
                java.lang.String r3 = r3.f184741f
                goto L_0x0080
            L_0x007f:
                r3 = 0
            L_0x0080:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                android.content.Intent r2 = new android.content.Intent
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r3 = r0.f163095d
                java.lang.Class<com.tencent.mm.plugin.mv.ui.MusicMvRouterUI> r4 = com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI.class
                r2.<init>(r3, r4)
                r3 = 67108864(0x4000000, float:1.5046328E-36)
                r2.addFlags(r3)
                r3 = 5
                java.lang.String r4 = "KEY_MUSIC_ROUTER"
                r2.putExtra(r4, r3)
                byte[] r3 = r1.toByteArray()
                java.lang.String r4 = "key_track_data"
                r2.putExtra(r4, r3)
                java.lang.String r3 = "key_seek_to_start"
                r4 = 1
                r2.putExtra(r3, r4)
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r3 = r0.f163095d
                r5 = 2130772185(0x7f0100d9, float:1.7147481E38)
                r8 = -1
                r3.overridePendingTransition(r8, r5)
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r3 = r0.f163095d
                k20.a r5 = new k20.a
                r5.<init>()
                r5.mo10233c(r2)
                java.lang.Object[] r10 = r5.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$doPost$1"
                java.lang.String r12 = "invoke"
                java.lang.String r13 = "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V"
                java.lang.String r14 = "Undefined"
                java.lang.String r15 = "startActivity"
                java.lang.String r16 = "(Landroid/content/Intent;)V"
                r9 = r3
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                r2 = 0
                java.lang.Object r2 = r5.mo10231a(r2)
                android.content.Intent r2 = (android.content.Intent) r2
                r3.startActivity(r2)
                java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$doPost$1"
                java.lang.String r11 = "invoke"
                java.lang.String r12 = "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;)V"
                java.lang.String r13 = "Undefined"
                java.lang.String r14 = "startActivity"
                java.lang.String r15 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r2 = r0.f163095d
                r2.setResult(r8)
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r2 = r0.f163095d
                r2.finish()
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r2 = r0.f163095d
                r2.getClass()
                com.tencent.mm.plugin.mv.model.MvCreateReportHelper r3 = com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper.f163005a
                boolean r2 = r2.f163094j
                java.lang.String r5 = hb2.C59832p.m69725a(r1)
                com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct r8 = r3.mo80352c()
                java.lang.String r9 = "PartList"
                java.lang.String r4 = r8.mo86045b(r9, r5, r4)
                r8.f156558q = r4
                if (r2 == 0) goto L_0x0116
                r6 = 1
            L_0x0116:
                r8.f156557p = r6
                r4 = 8
                r8.f156552k = r4
                r8.mo86054n()
                r8.mo86056r()
                long r1 = r1.f184743h
                com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct r3 = r3.mo80352c()
                r4 = 10
                r3.f156552k = r4
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.util.Map<java.lang.Long, com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct> r2 = com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper.f163009e
                r2.put(r1, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvPostUI.C56938a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI$b */
    public static final class C56939b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvPostUI f163096d;

        public C56939b(MusicMvPostUI musicMvPostUI) {
            this.f163096d = musicMvPostUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            MusicMvPostUI musicMvPostUI = this.f163096d;
            String O5 = C66785b.f191882e.mo90662O5();
            musicMvPostUI.f163094j = O5 == null || O5.length() == 0;
            MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
            c.f156552k = 14;
            c.mo86054n();
            c.mo86056r();
            this.f163096d.mo80387I7(true);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI$c */
    public static final class C56940c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvPostUI f163097d;

        public C56940c(MusicMvPostUI musicMvPostUI) {
            this.f163097d = musicMvPostUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ((C63845s0) C39818r.f106831a.mo62444c(this.f163097d).mo75002a(C63845s0.class)).mo88636c3(this.f163097d.f163089e, true, 4);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI$d */
    public static final class C56941d implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ MusicMvPostUI f163098a;

        /* renamed from: b */
        public final /* synthetic */ View f163099b;

        public C56941d(MusicMvPostUI musicMvPostUI, View view) {
            this.f163098a = musicMvPostUI;
            this.f163099b = view;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            C87412m.m108594g(str, "url");
            if ((bVar != null ? bVar.f59988d : null) != null && !bVar.f59988d.isRecycled()) {
                byte[] bytes = str.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                String f = C90193h.m112878f(bytes);
                C55593g gVar = C55593g.f158270a;
                AppCompatActivity context = this.f163098a.getContext();
                C87412m.m108593f(context, "context");
                View view2 = this.f163099b;
                Bitmap bitmap = bVar.f59988d;
                C87412m.m108593f(bitmap, "imageData.bitmap");
                C87412m.m108593f(f, "md5Key");
                gVar.mo77114b(context, view2, bitmap, f);
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI$e */
    public static final class C56942e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvPostUI f163100d;

        public C56942e(MusicMvPostUI musicMvPostUI) {
            this.f163100d = musicMvPostUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMvPostUI musicMvPostUI = this.f163100d;
            int i = MusicMvPostUI.f163088n;
            musicMvPostUI.getClass();
            C77407n nVar = new C77407n((Context) musicMvPostUI, 1, false);
            nVar.mo107566k(musicMvPostUI.getContext().getResources().getColor(C0966R.color.f2953a_));
            nVar.mo107570o(true);
            nVar.f225771i = new C61269a(musicMvPostUI);
            nVar.f225782p = new C61270b(musicMvPostUI, nVar);
            nVar.f225761d = C61271c.f174374a;
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvPostUI$f */
    public static final class C56943f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvPostUI f163101d;

        public C56943f(MusicMvPostUI musicMvPostUI) {
            this.f163101d = musicMvPostUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
            r1 = (r1 = (r1 = r1.f184739d).objectDesc).mvInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r21) {
            /*
                r20 = this;
                r6 = r20
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r21
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$9"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r20
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.mv.ui.MusicMvPostUI r0 = r6.f163101d
                te3.p23 r1 = r0.f163089e
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003b
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f184739d
                if (r1 == 0) goto L_0x003b
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x003b
                te3.hb1 r1 = r1.mvInfo
                if (r1 == 0) goto L_0x003b
                int r1 = r1.f183461j
                if (r1 != r2) goto L_0x003b
                r1 = 1
                goto L_0x003c
            L_0x003b:
                r1 = 0
            L_0x003c:
                java.lang.String r4 = "key_seek_to_start"
                java.lang.String r5 = "key_track_data"
                r7 = 0
                if (r1 == 0) goto L_0x0098
                r0.getClass()
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI> r8 = com.tencent.p014mm.plugin.p081mv.p082ui.free.MusicMvFreeMakerPreviewUI.class
                r1.<init>(r0, r8)
                te3.p23 r8 = r0.f163089e
                if (r8 == 0) goto L_0x0055
                byte[] r7 = r8.toByteArray()
            L_0x0055:
                r1.putExtra(r5, r7)
                r1.putExtra(r4, r2)
                r2 = 2
                java.lang.String r4 = "key_mv_from_scene"
                r1.putExtra(r4, r2)
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r1)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI"
                java.lang.String r10 = "enterFlexPreviewUI"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "Undefined"
                java.lang.String r13 = "startActivity"
                java.lang.String r14 = "(Landroid/content/Intent;)V"
                r7 = r0
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r1 = r2.mo10231a(r3)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.startActivity(r1)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI"
                java.lang.String r9 = "enterFlexPreviewUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "Undefined"
                java.lang.String r12 = "startActivity"
                java.lang.String r13 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x00f6
            L_0x0098:
                r0.getClass()
                android.content.Intent r1 = new android.content.Intent
                java.lang.Class<com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI> r8 = com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerPreviewUI.class
                r1.<init>(r0, r8)
                te3.p23 r8 = r0.f163089e
                if (r8 == 0) goto L_0x00aa
                byte[] r7 = r8.toByteArray()
            L_0x00aa:
                r1.putExtra(r5, r7)
                r1.putExtra(r4, r2)
                android.content.Intent r15 = r0.getIntent()
                r17 = 0
                r18 = 4
                r19 = 0
                java.lang.String r16 = "key_mv_from_scene"
                r14 = r1
                o40.C61926c.m72680e(r14, r15, r16, r17, r18, r19)
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r1)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI"
                java.lang.String r10 = "enterFixPreviewUI"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "Undefined"
                java.lang.String r13 = "startActivity"
                java.lang.String r14 = "(Landroid/content/Intent;)V"
                r7 = r0
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r1 = r2.mo10231a(r3)
                android.content.Intent r1 = (android.content.Intent) r1
                r0.startActivity(r1)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI"
                java.lang.String r9 = "enterFixPreviewUI"
                java.lang.String r10 = "()V"
                java.lang.String r11 = "Undefined"
                java.lang.String r12 = "startActivity"
                java.lang.String r13 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x00f6:
                java.lang.String r0 = "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$9"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvPostUI.C56943f.onClick(android.view.View):void");
        }
    }

    /* renamed from: H7 */
    public final void mo80386H7(String str) {
        Intent intent = new Intent();
        intent.putExtra("CropImageMode", 1);
        C58741j5 j5Var = C58741j5.f168184a;
        StringBuilder sb = new StringBuilder();
        sb.append("music_mv_cover_");
        C64621p23 p232 = this.f163089e;
        sb.append(p232 != null ? Long.valueOf(p232.f184743h) : null);
        sb.append('_');
        sb.append(MD5Util.getMD5String(str));
        intent.putExtra("CropImage_OutputPath", j5Var.mo83731e(sb.toString()));
        intent.putExtra("CropImage_ImgPath", str);
        intent.putExtra("CropImage_from_scene", 4);
        this.f163093i = true;
        ((C67654r1) ((C38874h) C86312j.m106911c(C38874h.class)).mo61618km()).mo93178k(this, intent, 1003);
    }

    /* renamed from: I7 */
    public final void mo80387I7(boolean z) {
        C64621p23 p232;
        C56938a aVar = new C56938a(this);
        mo80388J7();
        C13598b0 b0Var = null;
        if (!(this.f163090f == null || (p232 = this.f163089e) == null)) {
            C61275h.f174381a.mo86260b(p232);
            aVar.invoke(p232);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("MicroMsg.Mv.MusicMvPostUI", "create finder contact");
            if (z && C58784w3.m68438n(C58784w3.f168295a, this, (String) null, (String) null, (C60216z4.C8821a) null, 12, (Object) null)) {
                Intent intent = new Intent();
                intent.setClassName(this, "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI");
                intent.putExtra("key_create_scene", 7);
                intent.putExtra("key_router_to_profile", false);
                intent.putExtra("key_mv_status", 2);
                startActivityForResult(intent, 1002);
            }
        }
    }

    /* renamed from: J7 */
    public final void mo80388J7() {
        if (this.f163090f == null) {
            C66785b bVar = C66785b.f191882e;
            if (bVar.mo90662O5().length() > 0) {
                this.f163090f = C58961d.f168673a.mo84155b(bVar.mo90662O5());
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bja;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return C48501y0.m53872g(importUIComponents, C22415w0.m26092a(C63845s0.class));
        }
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1000:
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("KEY_RECORD_PHOTO_PATH");
                    if (stringExtra == null) {
                        Log.m105928w("MicroMsg.Mv.MusicMvPostUI", "capture null: ");
                        return;
                    }
                    this.f163092h = stringExtra;
                    mo80386H7(stringExtra);
                    return;
                }
                return;
            case 1001:
                if (intent != null && i2 == -1) {
                    String b = C7013o.m7260b(getContext(), intent, C7970a.m8127a());
                    if (b == null) {
                        Log.m105924i("MicroMsg.Mv.MusicMvPostUI", "onActivityResult: choose path null");
                        return;
                    } else {
                        mo80386H7(b);
                        return;
                    }
                } else {
                    return;
                }
            case 1002:
                Log.m105924i("MicroMsg.Mv.MusicMvPostUI", "callback create finder contact post");
                mo80387I7(false);
                return;
            case 1003:
                if (intent != null) {
                    String stringExtra2 = intent.getStringExtra("CropImage_OutputPath");
                    if (stringExtra2 == null) {
                        Log.m105924i("MicroMsg.Mv.MusicMvPostUI", "onActivityResult: crop path null");
                        return;
                    }
                    C86013q1.m106447h(this.f163092h);
                    if (i2 == -1) {
                        C86013q1.m106447h(this.f163091g);
                        this.f163091g = stringExtra2;
                        C64621p23 p232 = this.f163089e;
                        if (p232 != null) {
                            p232.f184741f = stringExtra2;
                        }
                        View findViewById = findViewById(C0966R.C0970id.aft);
                        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.kk6);
                        if (imageView != null) {
                            C20937c.C20939b bVar = new C20937c.C20939b();
                            bVar.f59345a = true;
                            bVar.f59353i = 1;
                            C20828a.m22825b().mo32520i(stringExtra2, imageView, bVar.mo32666a(), new C61272d(this, findViewById));
                            return;
                        }
                        return;
                    }
                    C86013q1.m106447h(stringExtra2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        ((C63845s0) C39818r.f106831a.mo62444c(this).mo75002a(C63845s0.class)).mo88636c3(this.f163089e, true, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0089, code lost:
        if (r8 == null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131099688(0x7f060028, float:1.7811736E38)
            int r8 = r8.getColor(r0)
            r7.setActionbarColor(r8)
            r8 = 2131833365(0x7f113215, float:1.929981E38)
            r7.setMMTitle((int) r8)
            r8 = 2131837118(0x7f1140be, float:1.9307422E38)
            java.lang.String r2 = r7.getString(r8)
            com.tencent.mm.plugin.mv.ui.MusicMvPostUI$b r3 = new com.tencent.mm.plugin.mv.ui.MusicMvPostUI$b
            r3.<init>(r7)
            com.tencent.mm.ui.MMActivityController$r r5 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.ORANGE
            r1 = 0
            r4 = 0
            r0 = r7
            r0.addTextOptionMenu(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.mv.ui.MusicMvPostUI$c r8 = new com.tencent.mm.plugin.mv.ui.MusicMvPostUI$c
            r8.<init>(r7)
            r7.setBackBtn(r8)
            r7.mo80388J7()
            fe1.q r8 = r7.f163090f
            r0 = 8
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x008b
            r3 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0060
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            androidx.appcompat.app.AppCompatActivity r5 = r7.getContext()
            java.lang.String r6 = r8.getNickname()
            android.text.SpannableString r4 = r4.mo107057T1(r5, r6)
            r3.setText(r4)
        L_0x0060:
            r3 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0088
            hc0.c$b r4 = new hc0.c$b
            r4.<init>()
            r4.f59346b = r2
            r4.f59345a = r2
            r4.f59364t = r2
            hc0.c r4 = r4.mo32666a()
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r8 = r8.getAvatarUrl()
            r5.mo32519h(r8, r3, r4)
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x0089
        L_0x0088:
            r8 = r1
        L_0x0089:
            if (r8 != 0) goto L_0x00c8
        L_0x008b:
            r8 = 2131309945(0x7f093579, float:1.8238188E38)
            android.view.View r3 = r7.findViewById(r8)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            if (r3 != 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            r3.setVisibility(r0)
        L_0x009a:
            android.view.View r3 = r7.findViewById(r8)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            if (r3 == 0) goto L_0x00a7
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            goto L_0x00a8
        L_0x00a7:
            r3 = r1
        L_0x00a8:
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r3, r4)
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            androidx.appcompat.app.AppCompatActivity r4 = r7.getContext()
            r5 = 56
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r3.topMargin = r4
            android.view.View r8 = r7.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 != 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            r8.setLayoutParams(r3)
        L_0x00c8:
            te3.p23 r8 = new te3.p23
            r8.<init>()
            r7.f163089e = r8
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r3 = "key_track_data"
            byte[] r8 = r8.getByteArrayExtra(r3)
            if (r8 == 0) goto L_0x00e2
            te3.p23 r3 = r7.f163089e
            if (r3 == 0) goto L_0x00e2
            r3.parseFrom(r8)
        L_0x00e2:
            te3.p23 r8 = r7.f163089e
            if (r8 == 0) goto L_0x00e8
            java.lang.String r1 = r8.f184741f
        L_0x00e8:
            r7.f163091g = r1
            r8 = 2131309768(0x7f0934c8, float:1.823783E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 2131298170(0x7f09077a, float:1.8214306E38)
            android.view.View r1 = r7.findViewById(r1)
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r3 == 0) goto L_0x0107
            r3 = 2131234979(0x7f0810a3, float:1.808614E38)
            r8.setBackgroundResource(r3)
            goto L_0x010d
        L_0x0107:
            r3 = 2131234980(0x7f0810a4, float:1.8086141E38)
            r8.setBackgroundResource(r3)
        L_0x010d:
            te3.p23 r8 = r7.f163089e
            if (r8 == 0) goto L_0x0150
            java.lang.String r8 = r8.f184741f
            if (r8 == 0) goto L_0x0150
            r3 = 2131315201(0x7f094a01, float:1.8248849E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L_0x0150
            r4 = 2131234174(0x7f080d7e, float:1.8084506E38)
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r5 == 0) goto L_0x012c
            r4 = 2131234173(0x7f080d7d, float:1.8084504E38)
        L_0x012c:
            androidx.appcompat.app.AppCompatActivity r5 = r7.getContext()
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r4)
            r3.setImageDrawable(r4)
            hc0.c$b r4 = new hc0.c$b
            r4.<init>()
            r4.f59345a = r2
            r4.f59353i = r2
            hc0.c r2 = r4.mo32666a()
            gc0.a r4 = gc0.C20828a.m22825b()
            com.tencent.mm.plugin.mv.ui.MusicMvPostUI$d r5 = new com.tencent.mm.plugin.mv.ui.MusicMvPostUI$d
            r5.<init>(r7, r1)
            r4.mo32520i(r8, r3, r2, r5)
        L_0x0150:
            te3.p23 r8 = r7.f163089e
            if (r8 == 0) goto L_0x0184
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f184739d
            if (r8 == 0) goto L_0x0184
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r8.objectDesc
            if (r8 == 0) goto L_0x0184
            te3.hb1 r8 = r8.mvInfo
            if (r8 == 0) goto L_0x0184
            te3.kb1 r8 = r8.f183456e
            if (r8 == 0) goto L_0x0184
            r1 = 2131309911(0x7f093557, float:1.823812E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0174
            java.lang.String r2 = r8.f183904d
            r1.setText(r2)
        L_0x0174:
            r1 = 2131309912(0x7f093558, float:1.8238121E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0184
            java.lang.String r8 = r8.f183905e
            r1.setText(r8)
        L_0x0184:
            r8 = 2131298965(0x7f090a95, float:1.8215918E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x0197
            com.tencent.mm.plugin.mv.ui.MusicMvPostUI$e r1 = new com.tencent.mm.plugin.mv.ui.MusicMvPostUI$e
            r1.<init>(r7)
            r8.setOnClickListener(r1)
        L_0x0197:
            androidx.appcompat.app.AppCompatActivity r8 = r7.getContext()
            int r8 = kg3.C76577a.m92151b(r8, r0)
            float r8 = (float) r8
            r0 = 2131312651(0x7f09400b, float:1.8243677E38)
            android.view.View r0 = r7.findViewById(r0)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r0
            if (r0 == 0) goto L_0x01ae
            r0.setRadius(r8)
        L_0x01ae:
            if (r0 == 0) goto L_0x01b8
            com.tencent.mm.plugin.mv.ui.MusicMvPostUI$f r8 = new com.tencent.mm.plugin.mv.ui.MusicMvPostUI$f
            r8.<init>(r7)
            r0.setOnClickListener(r8)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvPostUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.valueOf(true & true));
    }

    public void onResume() {
        super.onResume();
        if (this.f163093i) {
            this.f163093i = false;
        }
    }
}
