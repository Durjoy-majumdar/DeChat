package sb2;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderDraftOpEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import eb0.C31543z5;
import er1.C58784w3;
import gy3.C87412m;
import hb2.C59832p;
import ht1.C60216z4;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import la2.C99364n;
import lb2.C61275h;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import p599lr.C61381b;
import qo3.C77407n;
import te3.C64394ge0;
import te3.C64532lq2;
import te3.C64621p23;
import te3.C64736tq2;
import te3.C64783vq0;
import up1.C65418l;
import up1.C65420m;
import wp1.C66166c;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: sb2.s0 */
public final class C63845s0 extends UIComponent {

    /* renamed from: d */
    public final String f180981d = "MicroMsg.Mv.MusicMvSaveDraftUIC";

    /* renamed from: e */
    public final int f180982e = 1;

    /* renamed from: f */
    public final int f180983f = 2;

    /* renamed from: g */
    public final int f180984g = 10031;

    /* renamed from: h */
    public C64621p23 f180985h;

    /* renamed from: i */
    public boolean f180986i;

    /* renamed from: j */
    public int f180987j = getIntent().getIntExtra("key_mv_from_scene", 0);

    /* renamed from: n */
    public int f180988n = 2;

    /* renamed from: sb2.s0$a */
    public static final class C63846a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C63845s0 f180989d;

        public C63846a(C63845s0 s0Var) {
            this.f180989d = s0Var;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C63845s0 s0Var = this.f180989d;
            e0Var.mo107142f(s0Var.f180982e, s0Var.getContext().getResources().getString(C0966R.string.h3t));
            C63845s0 s0Var2 = this.f180989d;
            e0Var.mo107140d(s0Var2.f180983f, s0Var2.getColor(C0966R.color.f2966ao), this.f180989d.getContext().getResources().getString(C0966R.string.h3s));
        }
    }

    /* renamed from: sb2.s0$b */
    public static final class C63847b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C63845s0 f180990d;

        /* renamed from: e */
        public final /* synthetic */ C64621p23 f180991e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f180992f;

        public C63847b(C63845s0 s0Var, C64621p23 p232, C77407n nVar) {
            this.f180990d = s0Var;
            this.f180991e = p232;
            this.f180992f = nVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            C63845s0 s0Var = this.f180990d;
            boolean z = false;
            if (itemId == s0Var.f180982e) {
                if (C66785b.f191882e.mo90662O5().length() == 0) {
                    z = true;
                }
                s0Var.f180986i = z;
                this.f180990d.mo88637d3(true, true, this.f180991e);
            } else if (itemId == s0Var.f180983f) {
                s0Var.f180986i = false;
                s0Var.mo88637d3(false, false, this.f180991e);
            } else {
                this.f180992f.mo107572p();
            }
        }
    }

    /* renamed from: sb2.s0$c */
    public static final class C63848c implements C77407n.C47880p {

        /* renamed from: a */
        public static final C63848c f180993a = new C63848c();

        public final void onDismiss() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63845s0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r7 = (r7 = (r7 = r1.f184739d).objectDesc).mvInfo;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88636c3(te3.C64621p23 r18, boolean r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            r0.f180988n = r2
            r3 = 7
            r4 = 4
            r5 = 0
            r6 = 1
            if (r19 == 0) goto L_0x00a4
            r0.f180985h = r1
            if (r1 == 0) goto L_0x0024
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r1.f184739d
            if (r7 == 0) goto L_0x0024
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0024
            te3.hb1 r7 = r7.mvInfo
            if (r7 == 0) goto L_0x0024
            int r7 = r7.f183461j
            if (r7 != r6) goto L_0x0024
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            r7 = r7 ^ r6
            r8 = 0
            r9 = 2
            if (r2 == r9) goto L_0x0043
            if (r7 == 0) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0054
        L_0x0031:
            if (r1 == 0) goto L_0x003d
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f184739d
            if (r2 == 0) goto L_0x003d
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x003d
            te3.hb1 r8 = r2.mvInfo
        L_0x003d:
            if (r8 != 0) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            r8.f183462n = r9
            goto L_0x0054
        L_0x0043:
            if (r1 == 0) goto L_0x004f
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r1.f184739d
            if (r2 == 0) goto L_0x004f
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x004f
            te3.hb1 r8 = r2.mvInfo
        L_0x004f:
            if (r8 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r8.f183462n = r5
        L_0x0054:
            qo3.n r2 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r3 = r17.getActivity()
            r2.<init>((android.content.Context) r3, (int) r6, (boolean) r6)
            r2.mo107570o(r6)
            android.content.res.Resources r3 = r17.getResources()
            r4 = 2131833361(0x7f113211, float:1.9299802E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 17
            android.content.res.Resources r5 = r17.getResources()
            r6 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r2.mo107568m(r3, r4, r5)
            android.app.Activity r3 = r17.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099798(0x7f060096, float:1.781196E38)
            int r3 = r3.getColor(r4)
            r2.mo107566k(r3)
            sb2.s0$a r3 = new sb2.s0$a
            r3.<init>(r0)
            r2.f225771i = r3
            sb2.s0$b r3 = new sb2.s0$b
            r3.<init>(r0, r1, r2)
            r2.f225782p = r3
            sb2.s0$c r1 = sb2.C63845s0.C63848c.f180993a
            r2.f225761d = r1
            r2.mo107573q()
            goto L_0x013e
        L_0x00a4:
            if (r2 != r3) goto L_0x00b2
            int r1 = r0.f180987j
            if (r1 == r6) goto L_0x00b2
            androidx.appcompat.app.AppCompatActivity r1 = r17.getActivity()
            r1.finish()
            return
        L_0x00b2:
            android.content.Intent r1 = new android.content.Intent
            androidx.appcompat.app.AppCompatActivity r3 = r17.getActivity()
            java.lang.Class<com.tencent.mm.plugin.mv.ui.MusicMvRouterUI> r7 = com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI.class
            r1.<init>(r3, r7)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r3)
            java.lang.String r3 = "KEY_MUSIC_ROUTER"
            r1.putExtra(r3, r4)
            androidx.appcompat.app.AppCompatActivity r3 = r17.getActivity()
            r7 = -1
            r8 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r3.overridePendingTransition(r7, r8)
            androidx.appcompat.app.AppCompatActivity r3 = r17.getActivity()
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r1)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC"
            java.lang.String r12 = "doBack"
            java.lang.String r13 = "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;ZI)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r7.mo10231a(r5)
            android.content.Intent r1 = (android.content.Intent) r1
            r3.startActivity(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC"
            java.lang.String r11 = "doBack"
            java.lang.String r12 = "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;ZI)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            androidx.appcompat.app.AppCompatActivity r1 = r17.getActivity()
            r1.finish()
            int r1 = r0.f180987j
            if (r1 != r6) goto L_0x0122
            la2.n r1 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
            r1.mo32210j()
        L_0x0122:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = dp1.C58408t0.f167337b
            if (r1 == 0) goto L_0x013e
            r1.exitPageId = r2
            if (r2 != r4) goto L_0x0130
            long r2 = eb0.C31543z5.m39453c()
            r1.sendOrExitButtonTime = r2
        L_0x0130:
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r1 = dp1.C58408t0.f167337b
            if (r1 == 0) goto L_0x013e
            dp1.u0 r2 = new dp1.u0
            r2.<init>(r1, r5)
            java.lang.String r1 = "Finder.FinderPostReportLogic"
            o40.C61926c.m72661F(r1, r2)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63845s0.mo88636c3(te3.p23, boolean, int):void");
    }

    /* renamed from: d3 */
    public final void mo88637d3(boolean z, boolean z2, C64621p23 p232) {
        C64532lq2 lq22;
        LinkedList<C64783vq0> linkedList;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList2;
        FinderObjectDesc finderObjectDesc2;
        LinkedList<FinderMedia> linkedList3;
        C65418l b;
        boolean z3 = z2;
        if (z) {
            if (C66785b.f191882e.mo90662O5().length() == 0) {
                if (C58784w3.m68438n(C58784w3.f168295a, getActivity(), (String) null, (String) null, (C60216z4.C8821a) null, 12, (Object) null)) {
                    Intent intent = new Intent();
                    intent.setClassName(getActivity(), "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI");
                    intent.putExtra("key_create_scene", 7);
                    intent.putExtra("key_router_to_profile", false);
                    intent.putExtra("key_mv_status", 1);
                    getActivity().startActivityForResult(intent, this.f180984g);
                    return;
                }
                return;
            }
        }
        int i = this.f180988n;
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.exitPageId = i;
            if (i == 4) {
                finderFeedReportObject.sendOrExitButtonTime = C31543z5.m39453c();
            }
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, z3));
            }
        }
        long j = 0;
        if (p232 != null) {
            C64621p23 p233 = z3 ? p232 : null;
            if (p233 != null) {
                C61275h.f174381a.mo86260b(p233);
                C65420m mVar = C65420m.f188268a;
                long j2 = p233.f184743h;
                long j3 = (j2 <= 0 || (b = mVar.mo89520b(j2)) == null) ? 0 : b.field_objectId;
                Log.m105924i("Finder.FinderDraftLogic", "saveDraftItem :" + p233.f184743h);
                C65418l lVar = new C65418l();
                lVar.field_objectId = j3;
                lVar.field_createTime = C31543z5.m39455e();
                lVar.field_localFlag = 1;
                C64783vq0 vq02 = new C64783vq0();
                FinderObject finderObject = p233.f184739d;
                vq02.f185976d = finderObject;
                if (finderObject != null) {
                    finderObject.f164794id = 0;
                }
                if (finderObject != null) {
                    finderObject.createtime = C31543z5.m39455e();
                }
                FinderObject finderObject2 = vq02.f185976d;
                if (!(finderObject2 == null || (finderObjectDesc2 = finderObject2.objectDesc) == null || (linkedList3 = finderObjectDesc2.media) == null)) {
                    linkedList3.clear();
                }
                String str = p233.f184741f;
                if (!(str == null || str.length() == 0)) {
                    FinderMedia finderMedia = new FinderMedia();
                    String str2 = p233.f184741f;
                    finderMedia.url = str2;
                    finderMedia.thumbUrl = str2;
                    finderMedia.mediaType = 2;
                    Log.m105924i("Finder.FinderDraftLogic", "saveDraftItem :" + finderMedia.url + " thumbUrl:" + finderMedia.thumbUrl);
                    FinderObject finderObject3 = vq02.f185976d;
                    if (!(finderObject3 == null || (finderObjectDesc = finderObject3.objectDesc) == null || (linkedList2 = finderObjectDesc.media) == null)) {
                        linkedList2.add(finderMedia);
                    }
                }
                vq02.f185977e = new C64394ge0();
                LinkedList<FinderObject> linkedList4 = p233.f184740e;
                if (!(linkedList4 == null || linkedList4.isEmpty())) {
                    C64394ge0 ge02 = vq02.f185977e;
                    if (ge02 != null) {
                        ge02.f183316o = new C64532lq2();
                    }
                    if (linkedList4 != null) {
                        for (FinderObject finderObject4 : linkedList4) {
                            C64783vq0 vq03 = new C64783vq0();
                            vq03.f185976d = finderObject4;
                            C64394ge0 ge03 = vq02.f185977e;
                            if (!(ge03 == null || (lq22 = ge03.f183316o) == null || (linkedList = lq22.f184151d) == null)) {
                                linkedList.add(vq03);
                            }
                        }
                    }
                }
                lVar.field_finderItem = vq02;
                FinderItem l2 = lVar.mo89514l2();
                C64736tq2 tq22 = new C64736tq2();
                tq22.f185645d = "FinderLocal_" + System.nanoTime();
                tq22.f185651j = C31543z5.m39451a();
                l2.setPostInfo(tq22);
                lVar.field_originMvInfo = p233.f184744i;
                lVar.field_objectType = 2;
                String str3 = p233.f184741f;
                if (str3 != null && C112551y.m153819s(str3, "http", false)) {
                    C66166c.f190172a.mo90230a(lVar);
                }
                long Ow = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0().mo90225Ow(lVar);
                FinderDraftOpEvent finderDraftOpEvent = new FinderDraftOpEvent();
                FinderDraftOpEvent.C55123a aVar = finderDraftOpEvent.f154766d;
                aVar.f154767a = 100;
                aVar.f154768b = Ow;
                finderDraftOpEvent.publish();
                ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12419l();
                C76912y0.m92769h(getActivity(), getString(C0966R.string.a2o), C0966R.raw.icons_filled_done);
            }
        }
        Intent intent2 = new Intent(getActivity(), MusicMvRouterUI.class);
        intent2.addFlags(67108864);
        intent2.putExtra("KEY_MUSIC_ROUTER", 4);
        AppCompatActivity activity = getActivity();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent2);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doDraft", "(ZZLcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doDraft", "(ZZLcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        getActivity().finish();
        if (this.f180987j == 1) {
            C99364n.m129616h().mo138822a().mo32210j();
        }
        MvCreateReportHelper mvCreateReportHelper = MvCreateReportHelper.f163005a;
        boolean z4 = this.f180986i;
        String a = C59832p.m69725a(p232);
        MvCreateActionStruct c = mvCreateReportHelper.mo80352c();
        c.f156553l = z3 ? 1 : 0;
        c.f156558q = c.mo86045b("PartList", a, true);
        if (z4) {
            j = 1;
        }
        c.f156557p = j;
        c.f156552k = 9;
        c.mo86054n();
        c.mo86056r();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f180984g) {
            Log.m105924i(this.f180981d, "callback create finder contact draft");
            C64621p23 p232 = this.f180985h;
            if (p232 != null) {
                mo88637d3(false, true, p232);
            }
        }
    }
}
