package com.tencent.p014mm.plugin.gallery.p473ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import f72.C97842b;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/ui/VLogPreloadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.gallery.ui.VLogPreloadUI */
public final class VLogPreloadUI extends MMActivity {

    /* renamed from: d */
    public static final C56814a f162815d = new C56814a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.gallery.ui.VLogPreloadUI$a */
    public static final class C56814a {
        public C56814a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo80225a(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList2, int[] iArr, Point point) {
            int i;
            C87412m.m108594g(context, "context");
            C87412m.m108594g(arrayList, "videoList");
            C87412m.m108594g(arrayList2, "imageList");
            C87412m.m108594g(iArr, FirebaseAnalytics.C113379b.INDEX);
            Intent intent = new Intent(context, VLogPreloadUI.class);
            intent.putStringArrayListExtra("key_select_video_list", arrayList);
            intent.putStringArrayListExtra("key_select_image_list", arrayList2);
            intent.putExtra(FirebaseAnalytics.C113379b.INDEX, iArr);
            if (point != null && (i = point.x) > 0 && point.y > 0) {
                intent.putExtra("KEY_PREVIEW_WIDTH", i);
                intent.putExtra("KEY_PREVIEW_HEIGHT", point.y);
            }
            Activity activity = (Activity) context;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4381);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/gallery/ui/VLogPreloadUI$Companion", "jumpToVLogPreloadUI", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;[ILandroid/graphics/Point;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            activity.overridePendingTransition(0, 0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cca;
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        C97842b.f286991a = true;
        getWindow().setFormat(-3);
        C76879j.m92723Q(getContext(), "", getString(C0966R.string.gap), true, false, (DialogInterface.OnCancelListener) null);
        getIntent().getStringArrayListExtra("key_select_video_list");
        getIntent().getStringArrayListExtra("key_select_image_list");
        getIntent().getIntArrayExtra(FirebaseAnalytics.C113379b.INDEX);
        Point i = C85875k4.m106186i(this);
        Point h = C85875k4.m106184h(this);
        int intExtra = getIntent().getIntExtra("KEY_PREVIEW_WIDTH", -1);
        int intExtra2 = getIntent().getIntExtra("KEY_PREVIEW_HEIGHT", -1);
        Log.m105924i("MicroMsg.VLogPreloadUI", "screen x:" + i.x + " y:" + i.y + "  realScreen x:" + h.x + " y:" + h.y + ", previewSize:" + intExtra + ',' + intExtra2);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.VLogPreloadUI", "VLogPreloadUI onDestroy");
    }
}
