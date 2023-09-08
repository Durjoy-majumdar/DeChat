package com.tencent.p014mm.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/WxLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.WxLinearLayoutManager */
public class WxLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: v */
    public Context f165733v;

    public WxLinearLayoutManager(Context context) {
        super(context);
        this.f165733v = context;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        String str = null;
        try {
            super.onLayoutChildren(rVar, wVar);
        } catch (IndexOutOfBoundsException unused) {
            Log.m105920e("MicroMsg.WxLinearLayoutManager", "meet a IOOBE in RecyclerView");
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLayoutChildren ");
            Context context = this.f165733v;
            if (context != null) {
                str = context.getClass().getName();
            }
            sb.append(str);
            Log.printErrStackTrace("MicroMsg.WxLinearLayoutManager", e, sb.toString(), new Object[0]);
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onLayoutChildren ");
            Context context2 = this.f165733v;
            if (context2 != null) {
                str = context2.getClass().getName();
            }
            sb4.append(str);
            Log.printErrStackTrace("MicroMsg.WxLinearLayoutManager", e2, sb4.toString(), new Object[0]);
        }
    }

    public WxLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.f165733v = context;
    }

    public WxLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f165733v = context;
    }
}
