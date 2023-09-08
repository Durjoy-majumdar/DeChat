package p1117h3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p1117h3.C108044b;

/* renamed from: h3.a */
public abstract class C108041a extends BaseAdapter implements Filterable, C108044b.C108045a {

    /* renamed from: d */
    public boolean f323541d;

    /* renamed from: e */
    public boolean f323542e;

    /* renamed from: f */
    public Cursor f323543f;

    /* renamed from: g */
    public Context f323544g;

    /* renamed from: h */
    public int f323545h;

    /* renamed from: i */
    public C108042a f323546i;

    /* renamed from: j */
    public DataSetObserver f323547j;

    /* renamed from: n */
    public C108044b f323548n;

    /* renamed from: h3.a$a */
    public class C108042a extends ContentObserver {
        public C108042a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            C108041a aVar = C108041a.this;
            if (aVar.f323542e && (cursor = aVar.f323543f) != null && !cursor.isClosed()) {
                aVar.f323541d = aVar.f323543f.requery();
            }
        }
    }

    /* renamed from: h3.a$b */
    public class C108043b extends DataSetObserver {
        public C108043b() {
        }

        public void onChanged() {
            C108041a aVar = C108041a.this;
            aVar.f323541d = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C108041a aVar = C108041a.this;
            aVar.f323541d = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C108041a(Context context, Cursor cursor, boolean z) {
        boolean z2 = true;
        char c = z ? (char) 1 : 2;
        if ((c & 1) == 1) {
            c |= 2;
            this.f323542e = true;
        } else {
            this.f323542e = false;
        }
        z2 = cursor == null ? false : z2;
        this.f323543f = cursor;
        this.f323541d = z2;
        this.f323544g = context;
        this.f323545h = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((c & 2) == 2) {
            this.f323546i = new C108042a();
            this.f323547j = new C108043b();
        } else {
            this.f323546i = null;
            this.f323547j = null;
        }
        if (z2) {
            C108042a aVar = this.f323546i;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f323547j;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo144460a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public void mo144461b(Cursor cursor) {
        Cursor cursor2 = this.f323543f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C108042a aVar = this.f323546i;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f323547j;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f323543f = cursor;
            if (cursor != null) {
                C108042a aVar2 = this.f323546i;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f323547j;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f323545h = cursor.getColumnIndexOrThrow("_id");
                this.f323541d = true;
                notifyDataSetChanged();
            } else {
                this.f323545h = -1;
                this.f323541d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: d */
    public abstract CharSequence mo144462d(Cursor cursor);

    /* renamed from: f */
    public abstract View mo144463f(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f323541d || (cursor = this.f323543f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f323541d) {
            return null;
        }
        this.f323543f.moveToPosition(i);
        if (view == null) {
            C108046c cVar = (C108046c) this;
            view = cVar.f323554q.inflate(cVar.f323553p, viewGroup, false);
        }
        mo144460a(view, this.f323544g, this.f323543f);
        return view;
    }

    public Filter getFilter() {
        if (this.f323548n == null) {
            this.f323548n = new C108044b(this);
        }
        return this.f323548n;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f323541d || (cursor = this.f323543f) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f323543f;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f323541d || (cursor = this.f323543f) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f323543f.getLong(this.f323545h);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f323541d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f323543f.moveToPosition(i)) {
            if (view == null) {
                view = mo144463f(this.f323544g, this.f323543f, viewGroup);
            }
            mo144460a(view, this.f323544g, this.f323543f);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }
}
