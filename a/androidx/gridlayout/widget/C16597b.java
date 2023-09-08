package androidx.gridlayout.widget;

import androidx.gridlayout.widget.GridLayout;
import java.util.Arrays;

/* renamed from: androidx.gridlayout.widget.b */
public class C16597b {

    /* renamed from: a */
    public GridLayout.C16588i[] f44657a;

    /* renamed from: b */
    public int f44658b;

    /* renamed from: c */
    public GridLayout.C16588i[][] f44659c;

    /* renamed from: d */
    public int[] f44660d;

    /* renamed from: e */
    public final /* synthetic */ GridLayout.C16590k f44661e;

    static {
        Class<GridLayout> cls = GridLayout.class;
    }

    public C16597b(GridLayout.C16590k kVar, GridLayout.C16588i[] iVarArr) {
        this.f44661e = kVar;
        int length = iVarArr.length;
        this.f44657a = new GridLayout.C16588i[length];
        this.f44658b = length - 1;
        int f = kVar.mo16895f() + 1;
        GridLayout.C16588i[][] iVarArr2 = new GridLayout.C16588i[f][];
        int[] iArr = new int[f];
        for (GridLayout.C16588i iVar : iVarArr) {
            int i = iVar.f44612a.f44644a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < f; i2++) {
            iVarArr2[i2] = new GridLayout.C16588i[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (GridLayout.C16588i iVar2 : iVarArr) {
            int i3 = iVar2.f44612a.f44644a;
            GridLayout.C16588i[] iVarArr3 = iVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            iVarArr3[i4] = iVar2;
        }
        this.f44659c = iVarArr2;
        this.f44660d = new int[(this.f44661e.mo16895f() + 1)];
    }

    /* renamed from: a */
    public void mo16915a(int i) {
        int[] iArr = this.f44660d;
        if (iArr[i] == 0) {
            iArr[i] = 1;
            for (GridLayout.C16588i iVar : this.f44659c[i]) {
                mo16915a(iVar.f44612a.f44645b);
                GridLayout.C16588i[] iVarArr = this.f44657a;
                int i2 = this.f44658b;
                this.f44658b = i2 - 1;
                iVarArr[i2] = iVar;
            }
            this.f44660d[i] = 2;
        }
    }
}
