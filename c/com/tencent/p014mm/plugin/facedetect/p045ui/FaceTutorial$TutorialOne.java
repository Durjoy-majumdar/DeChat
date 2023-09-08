package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceTutorial$TutorialOne */
public class FaceTutorial$TutorialOne extends HellAndroidXFragment {

    /* renamed from: e */
    public static final /* synthetic */ int f111462e = 0;

    /* renamed from: d */
    public View f111463d;

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceTutorial$TutorialOne$a */
    public class C41398a implements View.OnClickListener {
        public C41398a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceTutorial$TutorialOne$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FaceTutorial$TutorialOne faceTutorial$TutorialOne = FaceTutorial$TutorialOne.this;
            int i = FaceTutorial$TutorialOne.f111462e;
            faceTutorial$TutorialOne.getClass();
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreate");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m105924i("MicroMsg.FaceTutorialUI.TutorialTwo", "carson: onCreateView()");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f359666a61, viewGroup, false);
        this.f111463d = inflate;
        ((Button) inflate.findViewById(C0966R.C0970id.cqz)).setOnClickListener(new C41398a());
        return this.f111463d;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.FaceTutorialUI.TutorialTwo", "hy: TutorialTwo onDestroy");
    }
}
