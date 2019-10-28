const a=['小明','小刚','小强','小红','狗蛋'];
a.sort();
console.log(a.slice(0,a.length-1)+"和"+a.pop()+'同学')

const xiaoming ={
    name:'小明',birthday:'1997',school:'小学',score:null
};
Object.keys(xiaoming).forEach(item=>{
    console.log('xiaoming',item,'是',xiaoming[item]);
})

