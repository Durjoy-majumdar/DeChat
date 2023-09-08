package lh2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gh2.C98116a;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.m0 */
public final class C99450m0 implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ImageView f291588d;

    /* renamed from: e */
    public C101198e f291589e;

    /* renamed from: f */
    public boolean f291590f = true;

    /* renamed from: g */
    public int f291591g;

    public C99450m0(ImageView imageView, C101198e eVar) {
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291588d = imageView;
        this.f291589e = eVar;
        imageView.setOnClickListener(this);
        ImageView imageView2 = this.f291588d;
        imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_album, -1));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99450m0.class.getName();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onActivityResult requestCode:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " resultCode:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " data:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.RecordAlbumPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            r2 = -1
            r3 = 0
            if (r10 == r0) goto L_0x0096
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r10 == r0) goto L_0x0033
            goto L_0x00cd
        L_0x0033:
            if (r11 != r2) goto L_0x00cd
            if (r12 == 0) goto L_0x003e
            java.lang.String r10 = "CropImage_OutputPath_List"
            java.util.ArrayList r10 = r12.getStringArrayListExtra(r10)
            goto L_0x003f
        L_0x003e:
            r10 = r3
        L_0x003f:
            if (r10 == 0) goto L_0x0049
            int r11 = r10.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
        L_0x0049:
            gy3.C87412m.m108591d(r3)
            int r11 = r3.intValue()
            if (r11 <= 0) goto L_0x0060
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r11 = "photoList[0]"
            gy3.C87412m.m108593f(r10, r11)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0062
        L_0x0060:
            java.lang.String r10 = ""
        L_0x0062:
            r5 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "onActivityResult outputPhotoPath:"
            r10.append(r11)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r10 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.widget.ImageView r11 = r9.f291588d
            android.content.Context r11 = r11.getContext()
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r12 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0 = -1
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r8 = 0
            java.lang.String r4 = ""
            r2 = r12
            r3 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.mo129794a(r11, r12)
            return
        L_0x0096:
            if (r11 != r2) goto L_0x00cd
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            if (r12 == 0) goto L_0x00a7
            java.lang.String r11 = "key_select_video_list"
            java.util.ArrayList r11 = r12.getStringArrayListExtra(r11)
            goto L_0x00a8
        L_0x00a7:
            r11 = r3
        L_0x00a8:
            if (r12 == 0) goto L_0x00b1
            java.lang.String r0 = "key_select_image_list"
            java.util.ArrayList r3 = r12.getStringArrayListExtra(r0)
        L_0x00b1:
            xg2.b$a r12 = xg2.C102635b.f302228j
            int r12 = r12.mo142293a(r2, r3, r11)
            java.lang.String r0 = "PARAM_ROUTER_INT"
            r10.putInt(r0, r12)
            java.lang.String r12 = "PARAM_VIDEO_LIST"
            r10.putStringArrayList(r12, r11)
            java.lang.String r11 = "PARAM_PHOTO_LIST"
            r10.putStringArrayList(r11, r3)
            qh2.e r11 = r9.f291589e
            qh2.e$b r12 = qh2.C101198e.C101199b.RECORD_ROUTE
            r11.mo14585p(r12, r10)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99450m0.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordAlbumPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.RecordAlbumPlugin", "click RecordAlbumPlugin");
        Intent intent = new Intent();
        int i = this.f291591g;
        if (i == 3) {
            C98116a aVar = C98116a.f287596b;
            intent.putExtra("key_edit_video_max_time_length", aVar.mo106175b());
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            boolean z = false;
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_story_enable_vlog, false);
            if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || wf) {
                z = true;
            }
            intent.putExtra("key_can_select_video_and_pic", !z);
            if (((C98116a.C98117a) aVar.mo138761d()).f287603g) {
                Context context = this.f291588d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C96892t1.m124463c((Activity) context, 1000, 9, 22, 3, false, intent);
            } else {
                Context context2 = this.f291588d.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                C96892t1.m124463c((Activity) context2, 1000, 1, 22, 2, false, intent);
            }
            C110992d.f332428d.f310298k = 0;
        } else if (i == 11) {
            intent.putExtra("album_business_tag", "album_business_media");
            Context context3 = this.f291588d.getContext();
            C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
            C96892t1.m124463c((Activity) context3, 1000, 9, 25, 3, false, intent);
        } else if (i == 15) {
            intent.putExtra("key_edit_video_max_time_length", C98116a.f287596b.mo106175b());
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            Context context4 = this.f291588d.getContext();
            C87412m.m108592e(context4, "null cannot be cast to non-null type android.app.Activity");
            C96892t1.m124463c((Activity) context4, 1000, 1, 22, 3, false, intent);
            C110992d.f332428d.f310298k = 0;
        } else if (i != 16) {
            intent.putExtra("album_business_tag", "album_business_media");
            Context context5 = this.f291588d.getContext();
            C87412m.m108592e(context5, "null cannot be cast to non-null type android.app.Activity");
            C96892t1.m124463c((Activity) context5, 1000, 1, 23, 3, false, intent);
        } else {
            intent.putExtra("album_business_tag", "album_business_media");
            Context context6 = this.f291588d.getContext();
            C87412m.m108592e(context6, "null cannot be cast to non-null type android.app.Activity");
            C96892t1.m124463c((Activity) context6, 1001, 1, 29, 1, false, intent);
        }
        C110992d.f332425a.mo162670d(4);
        C110992d.f332431g.f310320j = 1;
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordAlbumPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (this.f291590f) {
            this.f291588d.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
