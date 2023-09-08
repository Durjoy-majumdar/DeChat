package com.tencent.p014mm.media.camera;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.media.camera.view.CameraKitView;
import f72.C97842b;
import gy3.C87412m;
import kotlin.Metadata;
import p192l4.C10462b;
import z70.C102977a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/CameraDemoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.CameraDemoActivity */
public final class CameraDemoActivity extends AppCompatActivity {

    /* renamed from: d */
    public C102977a f266803d;

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        C97842b.f286991a = true;
        getWindow().setFormat(-3);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6323vf, (ViewGroup) null, false);
        CameraKitView cameraKitView = (CameraKitView) C10462b.m10395a(inflate, C0966R.C0970id.apr);
        if (cameraKitView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            this.f266803d = new C102977a(constraintLayout, cameraKitView);
            setContentView((View) constraintLayout);
            C102977a aVar = this.f266803d;
            if (aVar != null) {
                aVar.f303878a.mo148275k(this);
            } else {
                C87412m.m108603p("activityMainBinding");
                throw null;
            }
        } else {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0966R.C0970id.apr)));
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
