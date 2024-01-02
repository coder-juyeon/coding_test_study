function solution(name, yearning, photo) {
    const hash = new Map();
    let score = 0;
    let answer = [];
    for (let i = 0; i < name.length; i++) {
        hash.set(name[i],yearning[i]);
    }
    photo.forEach((arr) => {
        arr.forEach((val, i) => {
            if(hash.get(val) != null) {
                score += hash.get(val);
            }
            else {
                score += 0;
            }
        })
        answer.push(score);
        score = 0;
    })

    return answer;
}