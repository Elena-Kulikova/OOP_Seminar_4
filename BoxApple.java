package Homework_s4;

class BoxApple<T extends Apple> extends Box<T> {
    @Override
    public void pourTo(Box<T> otherBox) {
        if (otherBox instanceof BoxApple<?>) {
            super.pourTo(otherBox);
        }
    }
}