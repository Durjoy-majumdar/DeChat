package lb2;

import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvPostUI;
import gy3.C87412m;
import ic0.C21070h;
import jc0.C21210b;
import p823sg.C90193h;
import z04.C119027c;

/* renamed from: lb2.d */
public final class C61272d implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ MusicMvPostUI f174375a;

    /* renamed from: b */
    public final /* synthetic */ View f174376b;

    public C61272d(MusicMvPostUI musicMvPostUI, View view) {
        this.f174375a = musicMvPostUI;
        this.f174376b = view;
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
            AppCompatActivity context = this.f174375a.getContext();
            C87412m.m108593f(context, "context");
            View view2 = this.f174376b;
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
