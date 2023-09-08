package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p755xs.C102720b;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference */
public final class CategoryWithTitlePreference extends Preference implements C102720b.C78973a {

    /* renamed from: J */
    public Context f205492J;

    /* renamed from: K */
    public TextView f205493K;

    /* renamed from: L */
    public ImageView f205494L;

    /* renamed from: M */
    public String f205495M;

    /* renamed from: N */
    public int f205496N;

    /* renamed from: P */
    public int f205497P;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference$a */
    public class C71009a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f205498d;

        public C71009a(Bitmap bitmap) {
            this.f205498d = bitmap;
        }

        public void run() {
            CategoryWithTitlePreference.this.f205494L.setImageBitmap(this.f205498d);
            CategoryWithTitlePreference.this.f205494L.setVisibility(0);
            CategoryWithTitlePreference.this.getClass();
        }
    }

    public CategoryWithTitlePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: G */
    public void mo69923G(int i) {
        if (this.f205493K != null) {
            Context context = this.f205492J;
            if (context != null) {
                this.f205495M = context.getString(i);
            }
            if (!Util.isNullOrNil(this.f205495M)) {
                this.f205493K.setVisibility(0);
                this.f205493K.setText(this.f205495M);
            } else {
                this.f205493K.setVisibility(8);
            }
        }
        super.mo69923G(i);
    }

    /* renamed from: H */
    public void mo69924H(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            TextView textView = this.f205493K;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            this.f205495M = charSequence.toString();
            TextView textView2 = this.f205493K;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f205493K.setText(charSequence);
                Log.m105926v("MicroMsg.scanner.CategoryWithTitlePreference", "title : " + this.f205493K.getText());
            }
        }
        super.mo69924H(charSequence);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        Log.m105918d("MicroMsg.scanner.CategoryWithTitlePreference", "get pic:" + str + ", iconurl:" + null);
        if (!Util.isNullOrNil(str) && str.equals((Object) null) && bitmap != null && !bitmap.isRecycled() && this.f205494L != null) {
            MMHandlerThread.postToMainThread(new C71009a(bitmap));
        }
    }

    /* renamed from: s */
    public CharSequence mo69928s() {
        return this.f205495M;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Bitmap N6;
        TextView textView;
        super.mo1086w(view);
        this.f205493K = (TextView) view.findViewById(16908310);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f15);
        this.f205494L = imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f205492J, (float) (this.f205496N / 2));
        layoutParams.height = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f205492J, (float) (this.f205497P / 2));
        this.f205494L.setLayoutParams(layoutParams);
        String str = this.f205495M;
        if (!(str == null || str.length() <= 0 || (textView = this.f205493K) == null)) {
            textView.setVisibility(0);
            this.f205493K.setText(this.f205495M);
            Log.m105926v("MicroMsg.scanner.CategoryWithTitlePreference", "onBindView title : " + this.f205493K.getText());
        }
        if (!Util.isNullOrNil((String) null) && (N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C78431a0((String) null))) != null && !N6.isRecycled()) {
            this.f205494L.setImageBitmap(N6);
            this.f205494L.setVisibility(0);
        }
    }

    public CategoryWithTitlePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f205495M = "";
        this.f205496N = 34;
        this.f205497P = 34;
        this.f121271G = C0966R.C0971layout.f359886bd3;
        this.f205492J = context;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
    }
}
