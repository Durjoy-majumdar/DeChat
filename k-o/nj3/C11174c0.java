package nj3;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: nj3.c0 */
public class C11174c0 extends AlertDialog {

    /* renamed from: d */
    public Context f32974d;

    /* renamed from: e */
    public View f32975e;

    /* renamed from: f */
    public BaseAdapter f32976f;

    /* renamed from: g */
    public ListView f32977g;

    /* renamed from: h */
    public CharSequence f32978h;

    /* renamed from: i */
    public AdapterView.OnItemClickListener f32979i;

    public C11174c0(Context context) {
        super(context, C0966R.style.a66);
        this.f32974d = context;
        if (C76577a.m92147C(context)) {
            this.f32975e = View.inflate(this.f32974d, C0966R.C0971layout.bcs, (ViewGroup) null);
        } else {
            this.f32975e = View.inflate(this.f32974d, C0966R.C0971layout.bcr, (ViewGroup) null);
        }
        this.f32977g = (ListView) this.f32975e.findViewById(C0966R.C0970id.foz);
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMListDialog", "dismiss exception, e = " + e.getMessage());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f32975e);
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f32978h = charSequence;
        } else {
            this.f32978h = null;
        }
    }

    public void show() {
        CharSequence charSequence = this.f32978h;
        if (charSequence != null) {
            charSequence.length();
        }
        AdapterView.OnItemClickListener onItemClickListener = this.f32979i;
        if (onItemClickListener != null) {
            this.f32977g.setOnItemClickListener(onItemClickListener);
        }
        BaseAdapter baseAdapter = this.f32976f;
        if (baseAdapter != null) {
            this.f32977g.setAdapter(baseAdapter);
        }
        super.show();
    }
}
