package zh3;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: zh3.d */
public final class C119117d extends AbstractCursor {

    /* renamed from: d */
    public final String[] f356722d;

    /* renamed from: e */
    public Object[] f356723e;

    /* renamed from: f */
    public int f356724f = 0;

    /* renamed from: g */
    public final int f356725g;

    public C119117d(String[] strArr) {
        this.f356722d = strArr;
        int length = strArr.length;
        this.f356725g = length;
        this.f356723e = new Object[(length * 16)];
    }

    /* renamed from: a */
    public void mo183794a(Object[] objArr) {
        int length = objArr.length;
        int i = this.f356725g;
        if (length == i) {
            int i2 = this.f356724f;
            this.f356724f = i2 + 1;
            int i3 = i2 * i;
            int i4 = i + i3;
            Object[] objArr2 = this.f356723e;
            if (i4 > objArr2.length) {
                int length2 = objArr2.length * 2;
                if (length2 >= i4) {
                    i4 = length2;
                }
                Object[] objArr3 = new Object[i4];
                this.f356723e = objArr3;
                System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
            }
            System.arraycopy(objArr, 0, this.f356723e, i3, this.f356725g);
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.f356725g + ", columnValues.length = " + objArr.length);
    }

    /* renamed from: b */
    public final Object mo183795b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f356725g)) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + i + ", # of columns: " + this.f356725g);
        }
        int i3 = this.mPos;
        if (i3 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (i3 < this.f356724f) {
            return this.f356723e[(i3 * i2) + i];
        } else {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
    }

    /* renamed from: c */
    public int mo183796c(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public void fillWindow(int i, CursorWindow cursorWindow) {
        boolean z;
        if (i >= 0 && i < this.f356724f) {
            cursorWindow.acquireReference();
            try {
                int position = getPosition();
                int columnCount = getColumnCount();
                cursorWindow.clear();
                cursorWindow.setStartPosition(i);
                cursorWindow.setNumColumns(columnCount);
                if (moveToPosition(i)) {
                    while (true) {
                        if (cursorWindow.allocRow()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= columnCount) {
                                    break;
                                }
                                int c = mo183796c(mo183795b(i2));
                                if (c == 0) {
                                    z = cursorWindow.putNull(i, i2);
                                } else if (c == 1) {
                                    z = cursorWindow.putLong(getLong(i2), i, i2);
                                } else if (c == 2) {
                                    z = cursorWindow.putDouble(getDouble(i2), i, i2);
                                } else if (c != 4) {
                                    String string = getString(i2);
                                    z = string != null ? cursorWindow.putString(string, i, i2) : cursorWindow.putNull(i, i2);
                                } else {
                                    byte[] blob = getBlob(i2);
                                    z = blob != null ? cursorWindow.putBlob(blob, i, i2) : cursorWindow.putNull(i, i2);
                                }
                                if (!z) {
                                    cursorWindow.freeLastRow();
                                    break;
                                }
                                i2++;
                            }
                            i++;
                            if (!moveToNext()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                moveToPosition(position);
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                cursorWindow.releaseReference();
                throw th;
            }
            cursorWindow.releaseReference();
        }
    }

    public byte[] getBlob(int i) {
        return (byte[]) mo183795b(i);
    }

    public String[] getColumnNames() {
        return this.f356722d;
    }

    public int getCount() {
        return this.f356724f;
    }

    public double getDouble(int i) {
        Object b = mo183795b(i);
        if (b == null) {
            return 0.0d;
        }
        return b instanceof Number ? ((Number) b).doubleValue() : Util.getDouble(b.toString(), 0.0d);
    }

    public float getFloat(int i) {
        Object b = mo183795b(i);
        if (b == null) {
            return 0.0f;
        }
        return b instanceof Number ? ((Number) b).floatValue() : Util.getFloat(b.toString(), 0.0f);
    }

    public int getInt(int i) {
        Object b = mo183795b(i);
        if (b == null) {
            return 0;
        }
        return b instanceof Number ? ((Number) b).intValue() : Util.getInt(b.toString(), 0);
    }

    public long getLong(int i) {
        Object b = mo183795b(i);
        if (b == null) {
            return 0;
        }
        return b instanceof Number ? ((Number) b).longValue() : Util.getLong(b.toString(), 0);
    }

    public short getShort(int i) {
        Object b = mo183795b(i);
        if (b == null) {
            return 0;
        }
        return b instanceof Number ? ((Number) b).shortValue() : Short.parseShort(b.toString());
    }

    public String getString(int i) {
        Object b = mo183795b(i);
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    public int getType(int i) {
        return mo183796c(mo183795b(i));
    }

    public boolean isNull(int i) {
        return mo183795b(i) == null;
    }
}
