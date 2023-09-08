package com.tencent.p014mm.p136ui.widget.cropview;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.file.XVFSFile;
import kotlin.Metadata;
import po3.C11994o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0013R*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/VideoTimeView;", "Landroid/widget/TextView;", "Lpo3/o;", "", "value", "d", "I", "getDuration", "()I", "setDuration", "(I)V", "duration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.VideoTimeView */
public final class VideoTimeView extends TextView implements C11994o {

    /* renamed from: d */
    public int f24839d;

    public VideoTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new MMHandler(Looper.getMainLooper());
        setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.f3684bd));
        setTextColor(getContext().getResources().getColor(C0966R.color.f2975b6));
        setBackgroundResource(C0966R.C0969drawable.f4904qx);
        int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3766df);
        int dimension2 = (int) getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        setPadding(dimension, dimension2, dimension, dimension2);
    }

    /* renamed from: a */
    public final String mo8093a(int i) {
        if (i < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i);
            return sb.toString();
        }
        return i + "";
    }

    public final int getDuration() {
        return this.f24839d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setDuration(int i) {
        this.f24839d = i;
        setText(mo8093a(i / 60) + XVFSFile.PATH_SEPARATOR_CHAR + mo8093a(i % 60));
        StringBuilder sb = new StringBuilder();
        sb.append("[setDuration] value=");
        sb.append(i);
        Log.m105924i("MicroMsg.VideoTimeView", sb.toString());
    }

    public VideoTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new MMHandler(Looper.getMainLooper());
        setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.f3684bd));
        setTextColor(getContext().getResources().getColor(C0966R.color.f2975b6));
        setBackgroundResource(C0966R.C0969drawable.f4904qx);
        int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3766df);
        int dimension2 = (int) getContext().getResources().getDimension(C0966R.dimen.f3703bv);
        setPadding(dimension, dimension2, dimension, dimension2);
    }
}
