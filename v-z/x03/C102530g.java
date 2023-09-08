package x03;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import com.tencent.p014mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: x03.g */
public abstract class C102530g extends WebSearchVideoPlayerSeekBar {
    public C102530g(Context context) {
        super(context);
    }

    /* renamed from: p */
    public void mo36657p() {
        super.mo36657p();
        setBackgroundColor(Color.parseColor("#40000000"));
    }

    public void setCurrentPlaySecond(int i) {
        this.f273529p = i;
        TextView textView = this.f273526j;
        textView.setText(mo130086q(i / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(i % 60));
        mo134718x(mo134717w(i));
    }

    /* renamed from: y */
    public abstract void mo36667y();

    /* renamed from: z */
    public abstract void mo36668z();
}
