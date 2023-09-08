package ry1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.game.p061ui.GameMessageListUserIconView;
import uy1.C52645f;

/* renamed from: ry1.r0 */
public class C48153r0 implements C52645f.C52652e {

    /* renamed from: a */
    public final /* synthetic */ String f129075a;

    /* renamed from: b */
    public final /* synthetic */ GameMessageListUserIconView f129076b;

    public C48153r0(GameMessageListUserIconView gameMessageListUserIconView, String str) {
        this.f129076b = gameMessageListUserIconView;
        this.f129075a = str;
    }

    /* renamed from: a */
    public void mo65432a(View view, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f129076b.f114070f.put(this.f129075a, bitmap);
        }
    }

    /* renamed from: b */
    public void mo65433b(String str, View view) {
    }
}
