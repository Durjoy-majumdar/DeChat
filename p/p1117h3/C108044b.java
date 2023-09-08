package p1117h3;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.C103571z;

/* renamed from: h3.b */
public class C108044b extends Filter {

    /* renamed from: a */
    public C108045a f323551a;

    /* renamed from: h3.b$a */
    public interface C108045a {
    }

    public C108044b(C108045a aVar) {
        this.f323551a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return ((C103571z) this.f323551a).mo144462d((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            h3.b$a r0 = r4.f323551a
            androidx.appcompat.widget.z r0 = (androidx.appcompat.widget.C103571z) r0
            if (r5 != 0) goto L_0x0009
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x0009:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r1 = r0.f305869r
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0030
            androidx.appcompat.widget.SearchView r1 = r0.f305869r
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L_0x0022
            goto L_0x0030
        L_0x0022:
            android.app.SearchableInfo r1 = r0.f305870s     // Catch:{ RuntimeException -> 0x0030 }
            r3 = 50
            android.database.Cursor r5 = r0.mo144469i(r1, r5, r3)     // Catch:{ RuntimeException -> 0x0030 }
            if (r5 == 0) goto L_0x0030
            r5.getCount()     // Catch:{ RuntimeException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0041
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x0046
        L_0x0041:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1117h3.C108044b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C108045a aVar = this.f323551a;
        Cursor cursor = ((C108041a) aVar).f323543f;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((C103571z) aVar).mo144461b((Cursor) obj);
        }
    }
}
