package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;

/* renamed from: com.tencent.mm.plugin.game.ui.message.b0 */
public abstract class C42337b0<VH extends RecyclerView.C16631z> extends RecyclerView.C16613e<VH> {

    /* renamed from: d */
    public Context f114544d;

    /* renamed from: e */
    public Cursor f114545e;

    /* renamed from: f */
    public boolean f114546f;

    /* renamed from: g */
    public DataSetObserver f114547g;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.b0$b */
    public class C42339b extends DataSetObserver {
        public C42339b(C42338a aVar) {
        }

        public void onChanged() {
            super.onChanged();
            C42337b0 b0Var = C42337b0.this;
            b0Var.f114546f = true;
            b0Var.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            C42337b0 b0Var = C42337b0.this;
            b0Var.f114546f = false;
            b0Var.notifyDataSetChanged();
        }
    }

    public C42337b0(Context context, Cursor cursor) {
        this.f114544d = context;
        this.f114545e = cursor;
        this.f114546f = cursor != null;
        C42339b bVar = new C42339b((C42338a) null);
        this.f114547g = bVar;
        Cursor cursor2 = this.f114545e;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(bVar);
        }
    }

    /* renamed from: F4 */
    public void mo66413F4(Cursor cursor) {
        DataSetObserver dataSetObserver;
        Cursor cursor2 = this.f114545e;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (!(cursor2 == null || (dataSetObserver = this.f114547g) == null)) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
            this.f114545e = cursor;
            if (cursor != null) {
                DataSetObserver dataSetObserver2 = this.f114547g;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f114546f = true;
                notifyDataSetChanged();
            } else {
                this.f114546f = false;
                notifyDataSetChanged();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: G4 */
    public abstract void mo66414G4(VH vh, Cursor cursor);

    public int getItemCount() {
        Cursor cursor;
        if (!this.f114546f || (cursor = this.f114545e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!this.f114546f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f114545e.moveToPosition(i)) {
            mo66414G4(vh, this.f114545e);
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(true);
    }
}
