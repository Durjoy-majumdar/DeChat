package com.tencent.p014mm.p136ui.chatting.component;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.ImageView;
import ck3.C39969i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct;
import com.tencent.p014mm.modelimage.C68118i0;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.modelimage.C92809c0;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.tools.C7011n;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C97625j3;
import ew1.C31728a;
import f12.C7970a;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C76912y0;
import p140cw.C7138g;
import p158gt.C98201k;
import p270xi.C91212b;
import p910lj.C76701a;
import pc0.C100760a0;
import qo3.C77398g;
import tc0.C48629h;
import tc0.C77885p;
import zj3.C79386v0;
import zj3.C79387w;

@C91212b(exportInterface = C79386v0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.t4 */
public class C73601t4 extends C73412a implements C79386v0, C68129u.C68134e, C31728a.C31729a {

    /* renamed from: e */
    public C77398g f216118e;

    /* renamed from: A3 */
    public void mo58325A3(String str, int i, Intent intent) {
        Log.m105925i("MicroMsg.ChattingUI.SendImgComponent", "onResult %s, resultCode:%s", str, Integer.valueOf(i));
        mo102591a1(217, i, intent);
    }

    /* renamed from: D0 */
    public void mo102585D0(SightCaptureResult sightCaptureResult) {
        String str = sightCaptureResult.f201523p;
        if (!Util.isNullOrNil(str)) {
            try {
                boolean z = sightCaptureResult.f201516f;
                Log.m105925i("MicroMsg.ChattingUI.SendImgComponent", "doSendChattingImage, path: %s", str);
                C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                b.f295195i = z ? 2 : 1;
                b.f295188b = C75592q0.m90789s();
                b.f295187a = this.f215752d.mo91577r();
                b.f295196j = str;
                b.f295197k = 1;
                b.f295198l = null;
                b.f295200n = 0;
                b.f295204r = "";
                b.f295205s = "";
                b.f295202p = true;
                b.f295201o = C0966R.C0969drawable.by8;
                b.f295194h = 11;
                C97625j3.m125815e().mo123460f((C92809c0) b.mo140195a().f257313a);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingUI.SendImgComponent", "doSendChattingImage error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: J2 */
    public void mo102586J2(String str) {
        Log.m105925i("MicroMsg.ChattingUI.SendImgComponent", "registerAlbumCallback %s", str);
        C31728a aVar = C31728a.f84717a;
        C87412m.m108594g(str, "sessionId");
        HashMap<String, C31728a.C31729a> hashMap = C31728a.f84718b;
        if (!hashMap.values().contains(this)) {
            hashMap.put(str, this);
        }
        Log.m105924i("MicroMsg.AlbumResultDispatcher", "registerCallback: count " + hashMap.size());
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        mo102591a1(i, i2, intent);
    }

    /* renamed from: P1 */
    public void mo102587P1(ContextMenu contextMenu, int i, C72963f4 f4Var) {
        C92836k kVar;
        int i2;
        Class cls = C98201k.class;
        contextMenu.add(i, 100, 0, this.f215752d.mo91572m().getString(C0966R.string.b_0));
        if (f4Var.getMsgId() > 0) {
            kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
        } else {
            kVar = null;
        }
        if ((kVar == null || kVar.f267374a <= 0) && f4Var.mo108774y2() > 0) {
            kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
        }
        if (f4Var.mo108769t2() == 1 || (kVar != null && f4Var.mo108769t2() == 0 && kVar.f267376c >= (i2 = kVar.f267377d) && i2 != 0)) {
            contextMenu.add(i, 110, 0, this.f215752d.mo91572m().getString(C0966R.string.i48));
        }
        String str = "";
        if (kVar != null) {
            str = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(kVar.f267378e, str, str, true);
        }
        if (kVar != null && C86013q1.m106450k(str)) {
            contextMenu.add(i, 112, 0, this.f215752d.mo91572m().getString(C0966R.string.b7h));
        }
    }

    /* renamed from: T0 */
    public void mo102588T0(int i, int i2, int i3, String str) {
        if (str == null || str.equals("") || !C86013q1.m106450k(str)) {
            Log.m105918d("MicroMsg.ChattingUI.SendImgComponent", " doSendImage : filePath is null or empty");
            return;
        }
        if (!(this.f215752d.mo91574o().getUsername().equals("medianote") && (C75592q0.m90787q() & 16384) == 0)) {
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
            b.f295195i = 4;
            b.f295188b = this.f215752d.mo91573n();
            b.f295187a = this.f215752d.mo91577r();
            b.f295196j = str;
            b.f295197k = i;
            b.f295198l = null;
            b.f295200n = i3;
            b.f295204r = "";
            b.f295205s = "";
            b.f295202p = true;
            b.f295201o = C0966R.C0969drawable.by8;
            b.f295194h = 11;
            b.mo140195a().mo123694a();
            this.f215752d.mo91541B(true);
        }
    }

    /* renamed from: V2 */
    public boolean mo102589V2(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!uri.getPath().equals(k)) {
                uri = uri.buildUpon().path(k).build();
            }
        }
        return mo102590Y5(C116299g2.m163865u(uri)).f216134a;
    }

    /* renamed from: Y5 */
    public final t4$$e mo102590Y5(String str) {
        String str2 = str;
        t4$$e t4__e = new t4$$e((t4$$b) null);
        C77398g gVar = this.f216118e;
        if ((gVar == null || !gVar.isShowing()) && !Util.isNullOrNil(str) && ImgUtil.isImgFile(str)) {
            Bitmap extractThumbNail = BitmapUtil.extractThumbNail(str2, 300, 300, false);
            if (extractThumbNail == null) {
                Log.m105920e("MicroMsg.ChattingUI.SendImgComponent", "showAlert fail, bmp is null");
                return t4__e;
            }
            C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
            ImageView imageView = new ImageView(this.f215752d.mo91565f());
            int dimensionPixelSize = this.f215752d.mo91572m().getDimensionPixelSize(C0966R.dimen.f3895i6);
            imageView.setImageBitmap(extractThumbNail);
            imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ContentResolver contentResolver = this.f215752d.f193286j.getContentResolver();
            C9556a aVar = new C9556a();
            aVar.mo10233c("default_input_method");
            aVar.mo10233c(contentResolver);
            String str3 = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/SendImgComponent", "sendImgFromInput", "(Ljava/lang/String;)Lcom/tencent/mm/ui/chatting/component/SendImgComponent$IMESendImageResult;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
            boolean z = ImgUtil.isGif(C86013q1.m106433O(str2, 0, -1)) && str3 != null && (str3.contains("com.sohu.inputmethod.sogou") || str3.contains("com.tencent.qqpinyin"));
            if (!z) {
                C115669n.INSTANCE.mo175911u(1062, 20);
            } else if (str3.contains("com.sohu.inputmethod.sogou")) {
                C115669n.INSTANCE.mo175911u(1062, 1);
            } else if (str3.contains("com.tencent.qqpinyin")) {
                C115669n.INSTANCE.mo175911u(1062, 2);
            }
            if (!z || !C72996z1.m85812O4(this.f215752d.mo91577r())) {
                this.f216118e = C76879j.m92747r(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.bbr), imageView, this.f215752d.mo91572m().getString(C0966R.string.a18), this.f215752d.mo91572m().getString(C0966R.string.f7926wf), new t4$$c(this, z, wVar, str3, str), (DialogInterface.OnClickListener) null);
                t4__e.f216134a = true;
                t4__e.f216135b = true;
            } else {
                t4__e.f216135b = true;
                Log.m105924i("MicroMsg.ChattingUI.SendImgComponent", "gamelife fobidden image: from the third playground");
                C76701a.makeText((Context) this.f215752d.mo91565f(), (CharSequence) this.f215752d.mo91572m().getString(C0966R.string.c7o), 0).show();
                return t4__e;
            }
        }
        return t4__e;
    }

    /* renamed from: a1 */
    public boolean mo102591a1(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        Class cls = C79387w.class;
        this.f215752d.mo91561b();
        if (i2 != -1) {
            Log.m105921e("MicroMsg.ChattingUI.SendImgComponent", "[dealWithRequestCode] resultCode:%d", Integer.valueOf(i2));
            return false;
        } else if (i3 != 200) {
            if (i3 != 201) {
                if (i3 == 203) {
                    C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(cls);
                    String stringExtra = intent2.getStringExtra("CropImage_OutputPath");
                    if (stringExtra == null) {
                        wVar.mo102193k1().clearFocus();
                        return true;
                    }
                    boolean a = C75592q0.m90771a(stringExtra, this.f215752d.mo91577r(), intent2.getBooleanExtra("CropImage_Compress_Img", true));
                    int intExtra = intent2.getIntExtra("from_source", 0);
                    int intExtra2 = intent2.getIntExtra("CropImage_rotateCount", 0);
                    Log.m105918d("MicroMsg.ChattingUI.SendImgComponent", "dkimgsource" + intent2.getIntExtra("from_source", 0));
                    mo102588T0(a ? 1 : 0, intExtra, intExtra2, stringExtra);
                    wVar.mo102193k1().clearFocus();
                } else if (i3 == 217) {
                    if (intent2 == null) {
                        C68118i0 a2 = C68118i0.m80524a();
                        String r = this.f215752d.mo91577r();
                        a2.getClass();
                        ArrayList arrayList = new ArrayList();
                        if (!Util.isNullOrNil(r)) {
                            for (C68118i0.C68123e eVar : a2.f195776c.values()) {
                                eVar.getClass();
                                if (r.equals((Object) null)) {
                                    arrayList.add((Object) null);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            intent2 = new Intent();
                            intent2.putStringArrayListExtra("CropImage_OutputPath_List", arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(-1);
                            intent2.putIntegerArrayListExtra("GalleryUI_ImgIdList", arrayList2);
                            C115669n.INSTANCE.idkeyStat(594, 4, 1, true);
                        }
                    }
                    Intent intent3 = intent2;
                    if (intent3 == null) {
                        Log.m105920e("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
                        return true;
                    }
                    String stringExtra2 = intent3.getStringExtra("GalleryUI_ToUser");
                    String r2 = Util.isNullOrNil(stringExtra2) ? this.f215752d.mo91577r() : stringExtra2;
                    C39969i p = this.f215752d.mo91575p();
                    Log.m105925i("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE userFromIntent:%s rawUsername:%s", stringExtra2, this.f215752d.mo91577r());
                    C79387w wVar2 = (C79387w) this.f215752d.f193278b.mo102812a(cls);
                    wVar2.mo102193k1().clearFocus();
                    wVar2.mo102193k1().setBottomPanelVisibility(8);
                    C86709a0.m107525e().postToWorkerDelayed(new t4$$b(this, intent3, r2, p, wVar2, i), 100);
                }
                return false;
            }
            Context applicationContext = this.f215752d.mo91565f().getApplicationContext();
            C97625j3.m125812b().getClass();
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(applicationContext, intent2, C7970a.m8127a());
            if (g6 == null) {
                return true;
            }
            Intent intent4 = new Intent();
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(g6);
            intent4.putExtra("query_source_type", 3);
            intent4.putExtra("preview_image", true);
            intent4.putExtra("isTakePhoto", true);
            intent4.putExtra("GalleryUI_FromUser", this.f215752d.mo91573n());
            intent4.putExtra("GalleryUI_ToUser", this.f215752d.mo91577r());
            intent4.putExtra("is_long_click", true);
            intent4.putStringArrayListExtra("preview_image_list", arrayList3);
            intent4.addFlags(67108864);
            C88144b.m109797o(this.f215752d.f193286j, "gallery", ".ui.GalleryEntryUI", intent4, 217);
            return true;
        } else if (intent2 == null) {
            return true;
        } else {
            Intent intent5 = new Intent();
            intent5.setClassName(this.f215752d.mo91565f(), "com.tencent.mm.ui.tools.CropImageNewUI");
            intent5.putExtra("CropImageMode", 4);
            intent5.putExtra("CropImage_Filter", true);
            String r3 = this.f215752d.mo91577r();
            intent5.putExtra("CropImage_Has_Raw_Img_Btn", r3 == null || (!C72996z1.m85798E5(r3) && !C72996z1.m85848s5(r3)));
            intent5.putExtra("from_source", 3);
            BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
            C97625j3.m125812b().getClass();
            String a3 = C7970a.m8127a();
            if (!intent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
                String b = C7013o.m7260b(baseChattingUIFragment.getContext(), intent2, a3);
                if (!Util.isNullOrNil(b)) {
                    intent5.putExtra("CropImage_ImgPath", b);
                    baseChattingUIFragment.startActivityForResult(intent5, 203);
                }
            } else {
                new C7011n(intent, baseChattingUIFragment, a3, (C7013o.C7017c) null, intent5, 203).execute(new Integer[]{0});
            }
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo102592d(C72963f4 f4Var) {
        if (!f4Var.mo100979R3()) {
            return false;
        }
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f215752d.mo91565f(), this.f215752d.f193286j.getContentView());
            return true;
        }
        if (!this.f215752d.mo91577r().equals("medianote")) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
        }
        C73673d4.m87250d(f4Var);
        this.f215752d.mo91541B(true);
        return true;
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C92837k0.Ax0().f195790e = this;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        C92837k0.Ax0().f195790e = null;
    }

    /* renamed from: o5 */
    public void mo102593o5(String str, int i, String str2) {
        if (mo102590Y5(str2).f216135b) {
            C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
            wVar.mo102193k1().postDelayed(new t4$$d(this, wVar, str.substring(0, i)), 10);
        }
    }

    /* renamed from: u */
    public boolean mo102594u(MenuItem menuItem, C72963f4 f4Var) {
        if (menuItem.getItemId() != 110) {
            return false;
        }
        C6789c.m7088a(f4Var, this.f215752d.mo91565f(), new t4$$a(this, f4Var));
        if (!C75569c4.m90663I(f4Var)) {
            return true;
        }
        SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
        spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
        spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
        spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
        spamMediaToEmojiOPStruct.f194462g = 4;
        spamMediaToEmojiOPStruct.mo86054n();
        return true;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C92837k0.Ax0().f195790e = null;
    }
}
