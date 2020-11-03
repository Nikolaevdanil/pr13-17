package pr13.one.deux;

import java.util.Comparator;
import java.util.function.BiConsumer;

public interface SortConsumer<T> extends BiConsumer<T[], Comparator<T>> {
}