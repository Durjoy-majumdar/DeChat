package pw1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import yb2.C15946a;

/* renamed from: pw1.a */
public final class C62569a extends C15946a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62569a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        AppCompatActivity activity = getActivity();
        AlbumPreviewUI albumPreviewUI = activity instanceof AlbumPreviewUI ? (AlbumPreviewUI) activity : null;
        if (albumPreviewUI != null) {
            C94049a aVar = albumPreviewUI.f271290h;
            RecyclerView recyclerView = albumPreviewUI.f271282d;
            aVar.f271554v = true;
            recyclerView.mo17092j0(aVar.f271556x);
        }
    }
}
