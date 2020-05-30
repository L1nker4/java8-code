package wang.l1n.functioninterface;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}